package com.franco.bothrestsoaptest.soap.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DtoByte")
public class DTOByte {

    private byte[] bytes;

    @XmlElement(name = "bytes")
    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
