package cdnkxy.com.bean;

public class PageHelper {
	public static PageBean getPage(int currentPage,int totalRows){
		PageBean page = new PageBean (totalRows);
		if(currentPage != 0){
			page.refresh(currentPage);
		}
		return page;
	}
}
