package estrutural.proxy;

public class LazyBookParserProxy implements IBookParser{
	private BookParser bookParser = null;
	
	private String book = null;
	
	public LazyBookParserProxy(String book) {
		this.book = book;
	}

	@Override
	public int getNumPages() {
		if(this.bookParser == null) {
			this.bookParser = new BookParser(this.book);
			return this.bookParser.getNumPages();
		}
		return 0;
	}
	
	
}
