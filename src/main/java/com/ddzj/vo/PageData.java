package com.ddzj.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
public class PageData implements Serializable {

  private int totalElements;
  private List<Map<String,String>> content;

  public int getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(int totalElements) {
    this.totalElements = totalElements;
  }

  public List<Map<String, String>> getContent() {
    return content;
  }

  public void setContent(List<Map<String, String>> content) {
    this.content = content;
  }
}
