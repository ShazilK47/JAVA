public class browser {
    private String ip_address;
    private String https_request;
    public String ipAddress = getIpAddress(ip_address);

    public String https = getHttpsAddress(https_request);

    private String getHttpsAddress(String https_request) {
        return "https.www.google.com";
    }

    private String getIpAddress(String address) {
        return "192.0.3.4.2";
    }

}
