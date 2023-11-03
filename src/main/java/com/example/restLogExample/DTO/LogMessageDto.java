package com.example.restLogExample.DTO;


import java.util.List;


public class LogMessageDto {

    // Наименование производителя ПО
    private String vendor;

    // Наименование ПО
    private String product;

    // Версия ПО
    private String version;

    // FQDN хоста, зафиксировавшего событие ИБ, в нижнем регистре
    private String deviceHostName;

    // IP-адрес хоста, зафиксировавшего событие ИБ
    private String deviceAdress;

    // Код события
    private String deviceEventClassID;

    // Наименование операции \ события
    private String name;

    // Критичность операции \ события Целое число от 0 до 9
    private int severity;

    // Дата и время начала операции \ событиям
    private long startTime;

    // Дата и время окончания операции \ события
    private long endTime;

    // Имя УЗ пользователя-субъекта прикладной системы, выполнившего операцию
    private String sourceUserID;

    // Имя доменной УЗ пользователя-субъекта, выполнившего операцию, в нижнем регистр
    private String sourceUserName;

    // Домен УЗ из поля <SourceUserName>, в верхнем регистре
    private String sourceNtDomain;

    // Роль пользователя-субъекта прикладной системы, выполнившего операцию
    private List<String> sourceUserPrivileges;

    // FQDN хоста, с которого выполнена операция, в нижнем регистре
    private String sourceHostName;

    // IP-адрес хоста, с которого выполнена операция
    private String sourceAddress;

    // Результат выполнения операции.
    private String eventOutcome;

    // Имя УЗ пользователя-объекта прикладной системы, в отношении которой выполнена операция
    private String destinationUserID;

    // Имя доменной УЗ пользователя-объекта, в отношении которой выполнена операция, в нижнем регистре
    private String destinationUserName;

    // Домен УЗ из поля <DestinationUserName>, в верхнем регистре
    private String destinationNtDomain;

    // Роль пользователя-объекта в прикладной системе, в отношение которого выполнена операция
    private List<String> destinationUserPrivileges;

    // Подробная информация об операции/событии
    private String message;

    // Категория события
    private String category;


    public LogMessageDto() {

    }


    public LogMessageDto(String vendor, String product, String version, String deviceHostName, String deviceAdress, String deviceEventClassID, String name, int severity, long startTime, long endTime, String sourceUserID, String sourceUserName, String sourceNtDomain, List<String> sourceUserPrivileges, String sourceHostName, String sourceAddress, String eventOutcome, String destinationUserID, String destinationUserName, String destinationNtDomain, List<String> destinationUserPrivileges, String message, String category) {
        this.vendor = vendor;
        this.product = product;
        this.version = version;
        this.deviceHostName = deviceHostName;
        this.deviceAdress = deviceAdress;
        this.deviceEventClassID = deviceEventClassID;
        this.name = name;
        this.severity = severity;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sourceUserID = sourceUserID;
        this.sourceUserName = sourceUserName;
        this.sourceNtDomain = sourceNtDomain;
        this.sourceUserPrivileges = sourceUserPrivileges;
        this.sourceHostName = sourceHostName;
        this.sourceAddress = sourceAddress;
        this.eventOutcome = eventOutcome;
        this.destinationUserID = destinationUserID;
        this.destinationUserName = destinationUserName;
        this.destinationNtDomain = destinationNtDomain;
        this.destinationUserPrivileges = destinationUserPrivileges;
        this.message = message;
        this.category = category;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeviceHostName() {
        return deviceHostName;
    }

    public void setDeviceHostName(String deviceHostName) {
        this.deviceHostName = deviceHostName;
    }

    public String getDeviceAdress() {
        return deviceAdress;
    }

    public void setDeviceAdress(String deviceAdress) {
        this.deviceAdress = deviceAdress;
    }

    public String getDeviceEventClassID() {
        return deviceEventClassID;
    }

    public void setDeviceEventClassID(String deviceEventClassID) {
        this.deviceEventClassID = deviceEventClassID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getSourceUserID() {
        return sourceUserID;
    }

    public void setSourceUserID(String sourceUserID) {
        this.sourceUserID = sourceUserID;
    }

    public String getSourceUserName() {
        return sourceUserName;
    }

    public void setSourceUserName(String sourceUserName) {
        this.sourceUserName = sourceUserName;
    }

    public String getSourceNtDomain() {
        return sourceNtDomain;
    }

    public void setSourceNtDomain(String sourceNtDomain) {
        this.sourceNtDomain = sourceNtDomain;
    }

    public List<String> getSourceUserPrivileges() {
        return sourceUserPrivileges;
    }

    public void setSourceUserPrivileges(List<String> sourceUserPrivileges) {
        this.sourceUserPrivileges = sourceUserPrivileges;
    }

    public String getSourceHostName() {
        return sourceHostName;
    }

    public void setSourceHostName(String sourceHostName) {
        this.sourceHostName = sourceHostName;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getEventOutcome() {
        return eventOutcome;
    }

    public void setEventOutcome(String eventOutcome) {
        this.eventOutcome = eventOutcome;
    }

    public String getDestinationUserID() {
        return destinationUserID;
    }

    public void setDestinationUserID(String destinationUserID) {
        this.destinationUserID = destinationUserID;
    }

    public String getDestinationUserName() {
        return destinationUserName;
    }

    public void setDestinationUserName(String destinationUserName) {
        this.destinationUserName = destinationUserName;
    }

    public String getDestinationNtDomain() {
        return destinationNtDomain;
    }

    public void setDestinationNtDomain(String destinationNtDomain) {
        this.destinationNtDomain = destinationNtDomain;
    }

    public List<String> getDestinationUserPrivileges() {
        return destinationUserPrivileges;
    }

    public void setDestinationUserPrivileges(List<String> destinationUserPrivileges) {
        this.destinationUserPrivileges = destinationUserPrivileges;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
