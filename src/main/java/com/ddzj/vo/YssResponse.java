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
 * CreateDate:2019-08-01
 * </p>
 *
 * @author pc
 * @history Mender:pc；Date:2019-08-01；
 */
public class YssResponse implements Serializable {

  private long errcode;

  private String errmsg;

  private Object data;

  public long getErrcode() {
    return errcode;
  }

  public void setErrcode(long errcode) {
    this.errcode = errcode;
  }

  public String getErrmsg() {
    return errmsg;
  }

  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
