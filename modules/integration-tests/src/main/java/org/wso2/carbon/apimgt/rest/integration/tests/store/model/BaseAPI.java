/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.store.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * BaseAPI
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = CompositeAPI.class, name = "CompositeAPI"),
  @JsonSubTypes.Type(value = API.class, name = "API"),
})

public class BaseAPI {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("context")
  private String context = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("apiDefinition")
  private String apiDefinition = null;

  @JsonProperty("transport")
  private List<String> transport = null;

  @JsonProperty("gatewayLabels")
  private List<String> gatewayLabels = null;

  @JsonProperty("storeLabels")
  private List<String> storeLabels = null;

  @JsonProperty("hasOwnGateway")
  private Boolean hasOwnGateway = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    API("API"),
    
    COMPOSITEAPI("CompositeAPI");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public BaseAPI id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of the api registry artifact 
   * @return id
  **/
  @ApiModelProperty(value = "UUID of the api registry artifact ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BaseAPI name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BaseAPI description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BaseAPI context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public BaseAPI version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public BaseAPI provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * If the provider value is not given user invoking the api will be used as the provider. 
   * @return provider
  **/
  @ApiModelProperty(required = true, value = "If the provider value is not given user invoking the api will be used as the provider. ")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public BaseAPI apiDefinition(String apiDefinition) {
    this.apiDefinition = apiDefinition;
    return this;
  }

   /**
   * Swagger definition of the API which contains details about URI templates and scopes 
   * @return apiDefinition
  **/
  @ApiModelProperty(value = "Swagger definition of the API which contains details about URI templates and scopes ")
  public String getApiDefinition() {
    return apiDefinition;
  }

  public void setApiDefinition(String apiDefinition) {
    this.apiDefinition = apiDefinition;
  }

  public BaseAPI transport(List<String> transport) {
    this.transport = transport;
    return this;
  }

  public BaseAPI addTransportItem(String transportItem) {
    if (this.transport == null) {
      this.transport = new ArrayList<String>();
    }
    this.transport.add(transportItem);
    return this;
  }

   /**
   * Get transport
   * @return transport
  **/
  @ApiModelProperty(value = "")
  public List<String> getTransport() {
    return transport;
  }

  public void setTransport(List<String> transport) {
    this.transport = transport;
  }

  public BaseAPI gatewayLabels(List<String> gatewayLabels) {
    this.gatewayLabels = gatewayLabels;
    return this;
  }

  public BaseAPI addGatewayLabelsItem(String gatewayLabelsItem) {
    if (this.gatewayLabels == null) {
      this.gatewayLabels = new ArrayList<String>();
    }
    this.gatewayLabels.add(gatewayLabelsItem);
    return this;
  }

   /**
   * Get gatewayLabels
   * @return gatewayLabels
  **/
  @ApiModelProperty(value = "")
  public List<String> getGatewayLabels() {
    return gatewayLabels;
  }

  public void setGatewayLabels(List<String> gatewayLabels) {
    this.gatewayLabels = gatewayLabels;
  }

  public BaseAPI storeLabels(List<String> storeLabels) {
    this.storeLabels = storeLabels;
    return this;
  }

  public BaseAPI addStoreLabelsItem(String storeLabelsItem) {
    if (this.storeLabels == null) {
      this.storeLabels = new ArrayList<String>();
    }
    this.storeLabels.add(storeLabelsItem);
    return this;
  }

   /**
   * Get storeLabels
   * @return storeLabels
  **/
  @ApiModelProperty(value = "")
  public List<String> getStoreLabels() {
    return storeLabels;
  }

  public void setStoreLabels(List<String> storeLabels) {
    this.storeLabels = storeLabels;
  }

  public BaseAPI hasOwnGateway(Boolean hasOwnGateway) {
    this.hasOwnGateway = hasOwnGateway;
    return this;
  }

   /**
   * Get hasOwnGateway
   * @return hasOwnGateway
  **/
  @ApiModelProperty(value = "")
  public Boolean getHasOwnGateway() {
    return hasOwnGateway;
  }

  public void setHasOwnGateway(Boolean hasOwnGateway) {
    this.hasOwnGateway = hasOwnGateway;
  }

  public BaseAPI type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseAPI baseAPI = (BaseAPI) o;
    return Objects.equals(this.id, baseAPI.id) &&
        Objects.equals(this.name, baseAPI.name) &&
        Objects.equals(this.description, baseAPI.description) &&
        Objects.equals(this.context, baseAPI.context) &&
        Objects.equals(this.version, baseAPI.version) &&
        Objects.equals(this.provider, baseAPI.provider) &&
        Objects.equals(this.apiDefinition, baseAPI.apiDefinition) &&
        Objects.equals(this.transport, baseAPI.transport) &&
        Objects.equals(this.gatewayLabels, baseAPI.gatewayLabels) &&
        Objects.equals(this.storeLabels, baseAPI.storeLabels) &&
        Objects.equals(this.hasOwnGateway, baseAPI.hasOwnGateway) &&
        Objects.equals(this.type, baseAPI.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, context, version, provider, apiDefinition, transport, gatewayLabels, storeLabels, hasOwnGateway, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseAPI {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    apiDefinition: ").append(toIndentedString(apiDefinition)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    gatewayLabels: ").append(toIndentedString(gatewayLabels)).append("\n");
    sb.append("    storeLabels: ").append(toIndentedString(storeLabels)).append("\n");
    sb.append("    hasOwnGateway: ").append(toIndentedString(hasOwnGateway)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

