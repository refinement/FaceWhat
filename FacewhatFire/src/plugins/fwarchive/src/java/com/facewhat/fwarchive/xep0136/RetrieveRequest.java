package com.facewhat.fwarchive.xep0136;

import java.util.Date;

import org.dom4j.Element;
import org.dom4j.QName;

import com.facewhat.fwarchive.util.XmppDateUtil;
import com.facewhat.fwarchive.xep0059.XmppResultSet;

/**
 * A request to retrieve a collection.
 */
public class RetrieveRequest
{
    private String with;
    private Date start;

    private XmppResultSet resultSet;

    public RetrieveRequest(Element listElement)
    {
        this.with = listElement.attributeValue("with");
        this.start = XmppDateUtil.parseDate(listElement.attributeValue("start"));

        Element setElement = listElement.element(QName.get("set", XmppResultSet.NAMESPACE));
        if (setElement != null)
        {
            resultSet = new XmppResultSet(setElement);
        }
    }

    public String getWith()
    {
        return with;
    }

    public Date getStart()
    {
        return start;
    }

    public XmppResultSet getResultSet()
    {
        return resultSet;
    }
}
