package com.ddzj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 * CreateDate:2019-07-03
 * </p>
 *
 * @author pc
 * @history Mender:pc；Date:2019-07-03；
 */
public class TestLog {

    private static Logger logger = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        logger.info("{},{}","1","2");
        logger.info("{}test{}","1","2");
        logger.debug("{},{}","3","4");
        logger.debug("{}test{}","1","2");
        logger.error("{},{}","3","4");
        logger.error("{}test{}","1","2");
    }
}
