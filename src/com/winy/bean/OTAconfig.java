package com.winy.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("oTAconfig")
public class OTAconfig {
    @Value("${OTACode}")
    String OTACode;
    @Value("${key}")
    String key;
    @Value("${hostIP}")
    String hostIP;
    @Value("${ServerIP}")
    String serviceIP;
    @Value("${ServerPort}")
    String serverPort;
    @Value("${ServerProjectName}")
    String serverProjectName;

    /**
     * @return the oTACode
     */
    public String getOTACode() {
        return OTACode;
    }

    /**
     * @param oTACode
     *            the oTACode to set
     */
    public void setOTACode(String oTACode) {
        OTACode = oTACode;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     *            the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the hostIP
     */
    public String getHostIP() {
        return hostIP;
    }

    /**
     * @param hostIP
     *            the hostIP to set
     */
    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    /**
     * @return the serviceIP
     */
    public String getServiceIP() {
        return serviceIP;
    }

    /**
     * @param serviceIP
     *            the serviceIP to set
     */
    public void setServiceIP(String serviceIP) {
        this.serviceIP = serviceIP;
    }

    /**
     * @return the serverPort
     */
    public String getServerPort() {
        return serverPort;
    }

    /**
     * @param serverPort
     *            the serverPort to set
     */
    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * @return the serverProjectName
     */
    public String getServerProjectName() {
        return serverProjectName;
    }

    /**
     * @param serverProjectName
     *            the serverProjectName to set
     */
    public void setServerProjectName(String serverProjectName) {
        this.serverProjectName = serverProjectName;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "OTAconfig [OTACode=" + OTACode + ", key=" + key + ", hostIP=" + hostIP + ", serviceIP=" + serviceIP
                + ", serverPort=" + serverPort + ", serverProjectName=" + serverProjectName + "]";
    }

}
