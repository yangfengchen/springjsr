package com.ddzj.vo;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * <p>
 * Copyright: 2019 . All rights reserved.
 * </p>
 * <p>
 * Company: Zsoft
 * </p>
 * <p>
 * CreateDate:2019-08-02
 * </p>
 *
 * @author pc
 * @history Mender:pc；Date:2019-08-02；
 */
public class PageVo implements Serializable {
  private int pageNumber;
  private int pageSize;

  public int getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }
}
