/*
 * WSO2 API Manager - Gateway
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Gateway. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/master/components/apimgt/org.wso2.carbon.apimgt.rest.api.gateway/src/main/resources/gateway-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v2
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.gateway.api.v2.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SubscriptionDTO
 */

public class SubscriptionDTO {
  @SerializedName("subscriptionUUID")
  private String subscriptionUUID = null;

  @SerializedName("subscriptionId")
  private Integer subscriptionId = null;

  @SerializedName("policyId")
  private String policyId = null;

  @SerializedName("apiUUID")
  private String apiUUID = null;

  @SerializedName("apiId")
  private Integer apiId = null;

  @SerializedName("applicationUUID")
  private String applicationUUID = null;

  @SerializedName("appId")
  private Integer appId = null;

  @SerializedName("subscriptionState")
  private String subscriptionState = null;

  public SubscriptionDTO subscriptionUUID(String subscriptionUUID) {
    this.subscriptionUUID = subscriptionUUID;
    return this;
  }

   /**
   * Get subscriptionUUID
   * @return subscriptionUUID
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionUUID() {
    return subscriptionUUID;
  }

  public void setSubscriptionUUID(String subscriptionUUID) {
    this.subscriptionUUID = subscriptionUUID;
  }

  public SubscriptionDTO subscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(value = "")
  public Integer getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SubscriptionDTO policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @ApiModelProperty(value = "")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public SubscriptionDTO apiUUID(String apiUUID) {
    this.apiUUID = apiUUID;
    return this;
  }

   /**
   * Get apiUUID
   * @return apiUUID
  **/
  @ApiModelProperty(value = "")
  public String getApiUUID() {
    return apiUUID;
  }

  public void setApiUUID(String apiUUID) {
    this.apiUUID = apiUUID;
  }

  public SubscriptionDTO apiId(Integer apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * @return apiId
  **/
  @ApiModelProperty(value = "")
  public Integer getApiId() {
    return apiId;
  }

  public void setApiId(Integer apiId) {
    this.apiId = apiId;
  }

  public SubscriptionDTO applicationUUID(String applicationUUID) {
    this.applicationUUID = applicationUUID;
    return this;
  }

   /**
   * Get applicationUUID
   * @return applicationUUID
  **/
  @ApiModelProperty(value = "")
  public String getApplicationUUID() {
    return applicationUUID;
  }

  public void setApplicationUUID(String applicationUUID) {
    this.applicationUUID = applicationUUID;
  }

  public SubscriptionDTO appId(Integer appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(value = "")
  public Integer getAppId() {
    return appId;
  }

  public void setAppId(Integer appId) {
    this.appId = appId;
  }

  public SubscriptionDTO subscriptionState(String subscriptionState) {
    this.subscriptionState = subscriptionState;
    return this;
  }

   /**
   * Get subscriptionState
   * @return subscriptionState
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionState() {
    return subscriptionState;
  }

  public void setSubscriptionState(String subscriptionState) {
    this.subscriptionState = subscriptionState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDTO subscription = (SubscriptionDTO) o;
    return Objects.equals(this.subscriptionUUID, subscription.subscriptionUUID) &&
        Objects.equals(this.subscriptionId, subscription.subscriptionId) &&
        Objects.equals(this.policyId, subscription.policyId) &&
        Objects.equals(this.apiUUID, subscription.apiUUID) &&
        Objects.equals(this.apiId, subscription.apiId) &&
        Objects.equals(this.applicationUUID, subscription.applicationUUID) &&
        Objects.equals(this.appId, subscription.appId) &&
        Objects.equals(this.subscriptionState, subscription.subscriptionState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionUUID, subscriptionId, policyId, apiUUID, apiId, applicationUUID, appId, subscriptionState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDTO {\n");
    
    sb.append("    subscriptionUUID: ").append(toIndentedString(subscriptionUUID)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    apiUUID: ").append(toIndentedString(apiUUID)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    applicationUUID: ").append(toIndentedString(applicationUUID)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    subscriptionState: ").append(toIndentedString(subscriptionState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

