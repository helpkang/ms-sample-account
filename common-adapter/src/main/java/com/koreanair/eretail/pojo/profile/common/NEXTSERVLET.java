
package com.koreanair.eretail.pojo.profile.common;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NEXTSERVLET
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("", "NEXT_SERVLET");

    public NEXTSERVLET(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public NEXTSERVLET() {
        super(NAME, ((Class) String.class), null, null);
    }

}
