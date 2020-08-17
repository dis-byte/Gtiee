package cdnkxy.com.bean;

public class PageBean {
	private int allRow;
	private int totalPage;
	private int currentPage;
	private int pageSize = 8;
	public int getAllRow() {
		return allRow;
	}
	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public boolean isFirstPage()
    {
        return currentPage == 1;
    }

    public boolean isLastPage()
    {
        return currentPage == totalPage;
    }

    public boolean isHasNextPage()
    {
        return currentPage != totalPage;
    }

    public boolean isHasPrePage()
    {
        return currentPage != 1;
    }
	public int getStartRow() {
		return StartRow;
	}
	public void setStartRow(int startRow) {
		StartRow = startRow;
	}
	private int StartRow;
	 public PageBean(int _allRows) {     
	        // TODO Auto-generated constructor stub
	        this.allRow = _allRows;
	        totalPage = allRow % pageSize == 0 ? allRow/pageSize : allRow/pageSize + 1;
	        this.currentPage = 1;
	        StartRow = 0;
	    }
	    public void last()
	    {
	        currentPage = totalPage;    
	        StartRow = (currentPage - 1) * pageSize;    //算出每一页的开始行
	    }   
	    public void refresh(int _currentPage) {
	        currentPage = _currentPage;
	        if (currentPage > totalPage) {
	            last();
	        }
	    }
	
}
