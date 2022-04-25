package com.example.java13;

public class TextBlocks {
	public static void main(String[] args) {
		String JSON_STRING = "{\r\n" + "\"name\" : \"Example\",\r\n" + "\"website\" : \"https://www.%s.com/\"\r\n"
				+ "}";

		String TEXT_BLOCK_JSON = """
				{
				    "name" : "Example",
				    "website" : "https://www.%s.com/"
				}
				""";

		System.out.println(TEXT_BLOCK_JSON.formatted("example"));
	}
}
