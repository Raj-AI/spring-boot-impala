package com.example;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by amarendra on 14/04/17.
 */
public class WebStatMapper {

    public static WebStat mapWebStat(JdbcStream.SqlRow sqlRow){

        WebStat webStat = new WebStat();
        String host = sqlRow.getString("host");
        String domain = sqlRow.getString("dom");
        String feature = sqlRow.getString("feat");
        Timestamp date = sqlRow.getTimestamp("timestm");
        String core = sqlRow.getString("core");
        String db = sqlRow.getString("db");
        String activeVisitor = sqlRow.getString("active_visitor");

        if (host != null){
            webStat.setHost(host);
        }
        if (domain != null){
            webStat.setDomain(domain);
        }
        if (feature != null){
            webStat.setFeature(feature);
        }
        if (date != null) {
            webStat.setDate(new Date(date.getTime()));
        }
        if (core != null) {
            int intCore = 0;
            try {
                intCore = Integer.parseInt(core);
                webStat.setCore(intCore);
            } catch (NumberFormatException e) {
                // Do nothing
            }
        }
        if (db != null) {
            int intCore = 0;
            try {
                intCore = Integer.parseInt(db);
                webStat.setDb(intCore);
            } catch (NumberFormatException e) {
                // Do nothing
            }
        }
        if (activeVisitor != null) {
            int intCore = 0;
            try {
                intCore = Integer.parseInt(activeVisitor);
                webStat.setActiveVisitor(intCore);
            } catch (NumberFormatException e) {
                // Do nothing
            }
        }
        return webStat;

    }
}
