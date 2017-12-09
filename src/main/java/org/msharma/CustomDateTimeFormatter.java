/*
 * Copyright (c) 1/23/15 4:14 PM.Mohan Sharma - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package org.msharma;

import org.joda.time.format.*;

/**
 * @author Mohan Sharma Created on 1/20/2017.
 * parse the given input string date and conver to LocalDate
 */
public class CustomDateTimeFormatter {

    public static final DateTimeFormatter DATE_FORMATTER =
            new DateTimeFormatterBuilder()
                    .append(null,
                            new DateTimeParser[]{
                                    DateTimeFormat.forPattern("dd/MM/yyyy").getParser(),
                                    DateTimeFormat.forPattern("dd/MMM/yyyy").getParser(),
                                    DateTimeFormat.forPattern("dd/MM/yy").getParser(),
                                    DateTimeFormat.forPattern("dd/MMM/yy").getParser(),
                                    DateTimeFormat.forPattern("dd-MM-yyyy").getParser(),
                                    DateTimeFormat.forPattern("dd-MMM-yyyy").getParser(),
                                    DateTimeFormat.forPattern("dd-MM-yy").getParser(),
                                    DateTimeFormat.forPattern("dd-MMM-yy").getParser(),
                                    DateTimeFormat.forPattern("dd.MM.yyyy").getParser(),
                                    DateTimeFormat.forPattern("dd.MMM.yyyy").getParser(),
                                    DateTimeFormat.forPattern("dd.MM.yy").getParser(),
                                    DateTimeFormat.forPattern("dd.MMM.yy").getParser(),
                                    DateTimeFormat.forPattern("MM.dd.yyyy").getParser(),
                                    DateTimeFormat.forPattern("MMM.dd.yyyy").getParser(),
                                    DateTimeFormat.forPattern("MM.dd.yy").getParser(),
                                    DateTimeFormat.forPattern("MMM.dd.yy").getParser(),
                                    DateTimeFormat.forPattern("MM/dd/yy").getParser(),
                                    DateTimeFormat.forPattern("MMM/dd/yy").getParser(),
                                    DateTimeFormat.forPattern("MM/dd/yyyy").getParser(),
                                    DateTimeFormat.forPattern("MMM/dd/yyyy").getParser(),
                                    DateTimeFormat.forPattern("MM-dd-yy").getParser(),
                                    DateTimeFormat.forPattern("MMM-dd-yy").getParser(),
                                    DateTimeFormat.forPattern("MM-dd-yyyy").getParser(),
                                    DateTimeFormat.forPattern("MMM-dd-yyyy").getParser(),
                                    DateTimeFormat.forPattern("yyyy-MM-dd").getParser(),
                                    DateTimeFormat.forPattern("yyyy-MMM-dd").getParser(),
                                    DateTimeFormat.forPattern("yyyy/MM/dd").getParser(),
                                    DateTimeFormat.forPattern("yyyy/MMM/dd").getParser(),
                                    DateTimeFormat.forPattern("yy-MM-dd").getParser(),
                                    DateTimeFormat.forPattern("yy-MMM-dd").getParser(),
                                    DateTimeFormat.forPattern("yy/MM/dd").getParser(),
                                    DateTimeFormat.forPattern("yy.MM.dd").getParser(),
                                    DateTimeFormat.forPattern("yy.MMM.dd").getParser(),
                                    DateTimeFormat.forPattern("yyyy.MM.dd").getParser(),
                                    DateTimeFormat.forPattern("yy/dd/MM").getParser(),
                                    DateTimeFormat.forPattern("yy/dd/MMM").getParser(),
                                    DateTimeFormat.forPattern("yy.dd.MM").getParser(),
                                    DateTimeFormat.forPattern("yy.dd.MMM").getParser(),
                                    DateTimeFormat.forPattern("yyyy.dd.MM").getParser(),
                                    DateTimeFormat.forPattern("yyyy.dd.MMM").getParser(),
                                    DateTimeFormat.forPattern("yyyy.MMM.dd").getParser(),
                                    DateTimeFormat.forPattern("yyyy-MM-dd hh:mm:ss.S").getParser()
                            }).toFormatter();
}
