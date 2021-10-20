package org.openapitools.model;

import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalPropertiesObject  {
  
  @ApiModelProperty(value = "")
  private String name;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdditionalPropertiesObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Map> additionalProperties;
  
   /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
   @JsonAnySetter
   public AdditionalPropertiesObject putAdditionalProperty(String key, Map value) {
   if (this.additionalProperties == null) {
   this.additionalProperties = new HashMap<String, Map>();
   }
   this.additionalProperties.put(key, value);
   return this;
   }
  
   /**
   * Return the additional (undeclared) property.
   */
   @JsonAnyGetter
   public Map<String, Map> getAdditionalProperties() {
   return additionalProperties;
   }
  
   /**
   * Return the additional (undeclared) property with the specified name.
   */
   public Map getAdditionalProperty(String key) {
   if (this.additionalProperties == null) {
   return null;
   }
   return this.additionalProperties.get(key);
   }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesObject {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

