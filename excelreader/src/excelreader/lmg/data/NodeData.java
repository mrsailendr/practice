package excelreader.lmg.data;

import java.util.List;
import java.util.Map;

public class NodeData {
	private String l1;
	private Map<NodeWithUrlData,List<NodeWithUrlData>> l2l3Map;
	public String getL1() {
		return l1;
	}
	public void setL1(String l1) {
		this.l1 = l1;
	}
	public Map<NodeWithUrlData, List<NodeWithUrlData>> getL2l3Map() {
		return l2l3Map;
	}
	public void setL2l3Map(Map<NodeWithUrlData, List<NodeWithUrlData>> l2l3Map) {
		this.l2l3Map = l2l3Map;
	}
}
