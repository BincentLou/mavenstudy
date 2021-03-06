package com.david.study.maven.entity;

import java.io.Serializable;
import java.util.Date;


public class ExceptionRetryExt implements Serializable {

    /** 异常补偿ID */
    private Long invokeId;

    /** 租户号 */
    private String tenantId;

    /** 业务编号 */
    private String businessCode;

    /** 业务名称 */
    private String businessName;

    /** bean名称 */
    private String beanName;

    /** 执行类名称（全路径） */
    private String clazzName;

    /** 方法名称 */
    private String methodName;

    /** 参数类型（全路径） */
    private String paramsType;

    /** 参数值（json格式） */
    private String paramsValue;

    /** 错误信息 */
    private String errorDetail;

    /** 执行状态 0-待执行 1-执行中  */
    private Integer invokeStatus;

    /** 执行次数  */
    private Integer invokeTimes;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exception_retry
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.invoke_id
     *
     * @return the value of exception_retry.invoke_id
     *
     * @mbg.generated
     */
    public Long getInvokeId() {
        return invokeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.invoke_id
     *
     * @param invokeId the value for exception_retry.invoke_id
     *
     * @mbg.generated
     */
    public void setInvokeId(Long invokeId) {
        this.invokeId = invokeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.tenant_id
     *
     * @return the value of exception_retry.tenant_id
     *
     * @mbg.generated
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.tenant_id
     *
     * @param tenantId the value for exception_retry.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.business_code
     *
     * @return the value of exception_retry.business_code
     *
     * @mbg.generated
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.business_code
     *
     * @param businessCode the value for exception_retry.business_code
     *
     * @mbg.generated
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.business_name
     *
     * @return the value of exception_retry.business_name
     *
     * @mbg.generated
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.business_name
     *
     * @param businessName the value for exception_retry.business_name
     *
     * @mbg.generated
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.bean_name
     *
     * @return the value of exception_retry.bean_name
     *
     * @mbg.generated
     */
    public String getBeanName() {
        return beanName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.bean_name
     *
     * @param beanName the value for exception_retry.bean_name
     *
     * @mbg.generated
     */
    public void setBeanName(String beanName) {
        this.beanName = beanName == null ? null : beanName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.clazz_name
     *
     * @return the value of exception_retry.clazz_name
     *
     * @mbg.generated
     */
    public String getClazzName() {
        return clazzName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.clazz_name
     *
     * @param clazzName the value for exception_retry.clazz_name
     *
     * @mbg.generated
     */
    public void setClazzName(String clazzName) {
        this.clazzName = clazzName == null ? null : clazzName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.method_name
     *
     * @return the value of exception_retry.method_name
     *
     * @mbg.generated
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.method_name
     *
     * @param methodName the value for exception_retry.method_name
     *
     * @mbg.generated
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.params_type
     *
     * @return the value of exception_retry.params_type
     *
     * @mbg.generated
     */
    public String getParamsType() {
        return paramsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.params_type
     *
     * @param paramsType the value for exception_retry.params_type
     *
     * @mbg.generated
     */
    public void setParamsType(String paramsType) {
        this.paramsType = paramsType == null ? null : paramsType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.params_value
     *
     * @return the value of exception_retry.params_value
     *
     * @mbg.generated
     */
    public String getParamsValue() {
        return paramsValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.params_value
     *
     * @param paramsValue the value for exception_retry.params_value
     *
     * @mbg.generated
     */
    public void setParamsValue(String paramsValue) {
        this.paramsValue = paramsValue == null ? null : paramsValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.error_detail
     *
     * @return the value of exception_retry.error_detail
     *
     * @mbg.generated
     */
    public String getErrorDetail() {
        return errorDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.error_detail
     *
     * @param errorDetail the value for exception_retry.error_detail
     *
     * @mbg.generated
     */
    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail == null ? null : errorDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.invoke_status
     *
     * @return the value of exception_retry.invoke_status
     *
     * @mbg.generated
     */
    public Integer getInvokeStatus() {
        return invokeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.invoke_status
     *
     * @param invokeStatus the value for exception_retry.invoke_status
     *
     * @mbg.generated
     */
    public void setInvokeStatus(Integer invokeStatus) {
        this.invokeStatus = invokeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.invoke_times
     *
     * @return the value of exception_retry.invoke_times
     *
     * @mbg.generated
     */
    public Integer getInvokeTimes() {
        return invokeTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.invoke_times
     *
     * @param invokeTimes the value for exception_retry.invoke_times
     *
     * @mbg.generated
     */
    public void setInvokeTimes(Integer invokeTimes) {
        this.invokeTimes = invokeTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.create_time
     *
     * @return the value of exception_retry.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.create_time
     *
     * @param createTime the value for exception_retry.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_retry.update_time
     *
     * @return the value of exception_retry.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_retry.update_time
     *
     * @param updateTime the value for exception_retry.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exception_retry
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ExceptionRetryExt other = (ExceptionRetryExt) that;
        return (this.getInvokeId() == null ? other.getInvokeId() == null : this.getInvokeId().equals(other.getInvokeId()))
                && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
                && (this.getBusinessCode() == null ? other.getBusinessCode() == null : this.getBusinessCode().equals(other.getBusinessCode()))
                && (this.getBusinessName() == null ? other.getBusinessName() == null : this.getBusinessName().equals(other.getBusinessName()))
                && (this.getBeanName() == null ? other.getBeanName() == null : this.getBeanName().equals(other.getBeanName()))
                && (this.getClazzName() == null ? other.getClazzName() == null : this.getClazzName().equals(other.getClazzName()))
                && (this.getMethodName() == null ? other.getMethodName() == null : this.getMethodName().equals(other.getMethodName()))
                && (this.getParamsType() == null ? other.getParamsType() == null : this.getParamsType().equals(other.getParamsType()))
                && (this.getParamsValue() == null ? other.getParamsValue() == null : this.getParamsValue().equals(other.getParamsValue()))
                && (this.getErrorDetail() == null ? other.getErrorDetail() == null : this.getErrorDetail().equals(other.getErrorDetail()))
                && (this.getInvokeStatus() == null ? other.getInvokeStatus() == null : this.getInvokeStatus().equals(other.getInvokeStatus()))
                && (this.getInvokeTimes() == null ? other.getInvokeTimes() == null : this.getInvokeTimes().equals(other.getInvokeTimes()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exception_retry
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInvokeId() == null) ? 0 : getInvokeId().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getBusinessCode() == null) ? 0 : getBusinessCode().hashCode());
        result = prime * result + ((getBusinessName() == null) ? 0 : getBusinessName().hashCode());
        result = prime * result + ((getBeanName() == null) ? 0 : getBeanName().hashCode());
        result = prime * result + ((getClazzName() == null) ? 0 : getClazzName().hashCode());
        result = prime * result + ((getMethodName() == null) ? 0 : getMethodName().hashCode());
        result = prime * result + ((getParamsType() == null) ? 0 : getParamsType().hashCode());
        result = prime * result + ((getParamsValue() == null) ? 0 : getParamsValue().hashCode());
        result = prime * result + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        result = prime * result + ((getInvokeStatus() == null) ? 0 : getInvokeStatus().hashCode());
        result = prime * result + ((getInvokeTimes() == null) ? 0 : getInvokeTimes().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exception_retry
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", invokeId=").append(invokeId);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", businessCode=").append(businessCode);
        sb.append(", businessName=").append(businessName);
        sb.append(", beanName=").append(beanName);
        sb.append(", clazzName=").append(clazzName);
        sb.append(", methodName=").append(methodName);
        sb.append(", paramsType=").append(paramsType);
        sb.append(", paramsValue=").append(paramsValue);
        sb.append(", errorDetail=").append(errorDetail);
        sb.append(", invokeStatus=").append(invokeStatus);
        sb.append(", invokeTimes=").append(invokeTimes);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}