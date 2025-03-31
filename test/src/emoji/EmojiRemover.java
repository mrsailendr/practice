package emoji;

public class EmojiRemover {
	public static void main(String[] args) {
		String text = "🤣";
		System.out.println(text);
		String emojiregex = "[^\\p{L}\\p{M}\\p{N}\\p{P}\\p{Z}\\p{Cf}\\p{Cs}\\s]";
		String emojiRemoved = text.replaceAll(emojiregex, "") + null;
		System.out.println(emojiregex+null);
	}

}
