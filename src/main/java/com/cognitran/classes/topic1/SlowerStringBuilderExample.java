package com.cognitran.classes.topic1;

public class SlowerStringBuilderExample
{
    public static void main(String[] args)
    {
        int tenMilions = 10_000_000;

        long time = System.currentTimeMillis();
        for (int i = 0; i < tenMilions; i++)
        {
            String sql = "SELECT t.tsbId, coalesce(pi.NUM, t.REGIONALNUMBER), t.subject, md.publishable_date FROM navigation.TSBS t" +
                            " left join NAVIGATION.TSBPUBLISHINFO pi on pi.TSBID = t.TSBID" +
                            " left join dal.metadata md on md.referenced_univ_id=t.TSBID and md.is_current_ver='1' and md.IS_SOURCE_LANG='1'" +
                            " where t.globalNumber=? order by tsbId";
        }
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        for (int i = 0; i < tenMilions; i++)
        {
            String sql = new StringBuilder("SELECT t.tsbId, coalesce(pi.NUM, t.REGIONALNUMBER), t.subject, md.publishable_date FROM navigation.TSBS t")
                            .append(" left join NAVIGATION.TSBPUBLISHINFO pi on pi.TSBID = t.TSBID")
                            .append(" left join dal.metadata md on md.referenced_univ_id=t.TSBID and md.is_current_ver='1' and md.IS_SOURCE_LANG='1'")
                            .append(" where t.globalNumber=? order by tsbId").toString();
        }
        System.out.println(System.currentTimeMillis() - time);
    }
}
