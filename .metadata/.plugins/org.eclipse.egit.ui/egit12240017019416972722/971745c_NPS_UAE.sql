SELECT item_t1.p_user                   AS 'CustomerPK', 
       item_t1.p_code                   AS 'OrderCode', 
       item_t2.p_cellphone              AS 'MobilePhone', 
       item_t4.p_code                   AS 'Concept', 
       item_t5.p_carrier                AS 'DeliveryPartner', 
       lp_t6.p_name                     AS 'City', 
       lp_t7.p_name                     AS 'Country', 
       item_t1.p_isclickandcollectorder AS 'IsCnc', 
       CASE 
         WHEN item_t0.p_type = '8796587753563' THEN 'CHECKOUT_FLOW' 
         ELSE 'ORDER_DELIVERY' 
       END                              AS 'Type', 
       item_t0.p_rating                 AS 'Score', 
       item_t0.createdts                AS 'NpsCT', 
       item_t1.createdts                AS 'OrderCT', 
       item_t0.p_comment                AS 'Comment', 
       item_t8.p_code                   AS 'SubCategory', 
       item_t10.p_code                   AS 'Category',
       item_t9.p_code                   AS 'PaymentMode' ,
       item_t1.p_salesapplication As 'Platform'
FROM   lmgnpsrating item_t0 
       JOIN orders item_t1 
         ON item_t1.p_code = item_t0.p_orderno 
       JOIN addresses item_t2 
         ON item_t1.p_deliveryaddress = item_t2.pk 
       JOIN cmssite item_t3 
         ON item_t3.pk = item_t1.p_site 
       JOIN lmgconcept item_t4 
         ON item_t4.pk = item_t3.p_defaultconcept 
       LEFT JOIN consignments item_t5 
              ON item_t5.p_order = item_t1.pk 
       JOIN regions item_t6 
         ON item_t2.p_region = item_t6.pk 
       JOIN regionslp lp_t6 
         ON item_t6.pk = lp_t6.itempk 
            AND lp_t6.langpk = 8796093055008 
       JOIN countrieslp lp_t7 
         ON item_t6.p_country = lp_t7.itempk 
            AND lp_t7.langpk = 8796093055008 
       LEFT JOIN npscategory item_t8 
              ON item_t8.pk = item_t0.p_subcategory 
       LEFT JOIN paymentmodes item_t9 
              ON item_t9.pk = item_t1.p_paymentmode LEFT JOIN npscategory item_t10 on item_t10.pk=item_t0.p_category
WHERE   item_t1.p_versionid IS NULL AND item_t0.createdts >= 'LAST_START_TIME'