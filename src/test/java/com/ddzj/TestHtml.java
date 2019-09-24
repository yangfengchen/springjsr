package com.ddzj;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
 * CreateDate:2019-08-05
 * </p>
 *
 * @author pc
 * @history Mender:pc；Date:2019-08-05；
 */
public class TestHtml {

  public static void main(String[] args) {
    String url = "http://zjcs.gdggzy.org.cn/gd-zjcs-pub/pubNotice/view/a032723b-9f35-47bf-a919-870dc41908d2";
    try {
      Document document = Jsoup.connect(url).get();
      Elements elements = document.body().select(".detail__main");
      Element element = elements.get(0).removeClass(".main-title");
      System.out.println(element.outerHtml());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
