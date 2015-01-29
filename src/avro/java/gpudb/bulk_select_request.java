/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class bulk_select_request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"bulk_select_request\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"set_id\",\"type\":\"string\"},{\"name\":\"global_expression\",\"type\":\"string\"},{\"name\":\"expressions\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"params\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"user_auth_string\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence set_id;
  @Deprecated public java.lang.CharSequence global_expression;
  @Deprecated public java.util.List<java.lang.CharSequence> expressions;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params;
  @Deprecated public java.lang.CharSequence user_auth_string;

  /**
   * Default constructor.
   */
  public bulk_select_request() {}

  /**
   * All-args constructor.
   */
  public bulk_select_request(java.lang.CharSequence set_id, java.lang.CharSequence global_expression, java.util.List<java.lang.CharSequence> expressions, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params, java.lang.CharSequence user_auth_string) {
    this.set_id = set_id;
    this.global_expression = global_expression;
    this.expressions = expressions;
    this.params = params;
    this.user_auth_string = user_auth_string;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return set_id;
    case 1: return global_expression;
    case 2: return expressions;
    case 3: return params;
    case 4: return user_auth_string;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: set_id = (java.lang.CharSequence)value$; break;
    case 1: global_expression = (java.lang.CharSequence)value$; break;
    case 2: expressions = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: params = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 4: user_auth_string = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'set_id' field.
   */
  public java.lang.CharSequence getSetId() {
    return set_id;
  }

  /**
   * Sets the value of the 'set_id' field.
   * @param value the value to set.
   */
  public void setSetId(java.lang.CharSequence value) {
    this.set_id = value;
  }

  /**
   * Gets the value of the 'global_expression' field.
   */
  public java.lang.CharSequence getGlobalExpression() {
    return global_expression;
  }

  /**
   * Sets the value of the 'global_expression' field.
   * @param value the value to set.
   */
  public void setGlobalExpression(java.lang.CharSequence value) {
    this.global_expression = value;
  }

  /**
   * Gets the value of the 'expressions' field.
   */
  public java.util.List<java.lang.CharSequence> getExpressions() {
    return expressions;
  }

  /**
   * Sets the value of the 'expressions' field.
   * @param value the value to set.
   */
  public void setExpressions(java.util.List<java.lang.CharSequence> value) {
    this.expressions = value;
  }

  /**
   * Gets the value of the 'params' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getParams() {
    return params;
  }

  /**
   * Sets the value of the 'params' field.
   * @param value the value to set.
   */
  public void setParams(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.params = value;
  }

  /**
   * Gets the value of the 'user_auth_string' field.
   */
  public java.lang.CharSequence getUserAuthString() {
    return user_auth_string;
  }

  /**
   * Sets the value of the 'user_auth_string' field.
   * @param value the value to set.
   */
  public void setUserAuthString(java.lang.CharSequence value) {
    this.user_auth_string = value;
  }

  /** Creates a new bulk_select_request RecordBuilder */
  public static avro.java.gpudb.bulk_select_request.Builder newBuilder() {
    return new avro.java.gpudb.bulk_select_request.Builder();
  }
  
  /** Creates a new bulk_select_request RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.bulk_select_request.Builder newBuilder(avro.java.gpudb.bulk_select_request.Builder other) {
    return new avro.java.gpudb.bulk_select_request.Builder(other);
  }
  
  /** Creates a new bulk_select_request RecordBuilder by copying an existing bulk_select_request instance */
  public static avro.java.gpudb.bulk_select_request.Builder newBuilder(avro.java.gpudb.bulk_select_request other) {
    return new avro.java.gpudb.bulk_select_request.Builder(other);
  }
  
  /**
   * RecordBuilder for bulk_select_request instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<bulk_select_request>
    implements org.apache.avro.data.RecordBuilder<bulk_select_request> {

    private java.lang.CharSequence set_id;
    private java.lang.CharSequence global_expression;
    private java.util.List<java.lang.CharSequence> expressions;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params;
    private java.lang.CharSequence user_auth_string;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.bulk_select_request.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.bulk_select_request.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing bulk_select_request instance */
    private Builder(avro.java.gpudb.bulk_select_request other) {
            super(avro.java.gpudb.bulk_select_request.SCHEMA$);
      if (isValidValue(fields()[0], other.set_id)) {
        this.set_id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.set_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.global_expression)) {
        this.global_expression = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.global_expression);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.expressions)) {
        this.expressions = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[2].schema(), other.expressions);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.params)) {
        this.params = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[3].schema(), other.params);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.user_auth_string)) {
        this.user_auth_string = (java.lang.CharSequence) data().deepCopy(fields()[4].schema(), other.user_auth_string);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'set_id' field */
    public java.lang.CharSequence getSetId() {
      return set_id;
    }
    
    /** Sets the value of the 'set_id' field */
    public avro.java.gpudb.bulk_select_request.Builder setSetId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.set_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'set_id' field has been set */
    public boolean hasSetId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'set_id' field */
    public avro.java.gpudb.bulk_select_request.Builder clearSetId() {
      set_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'global_expression' field */
    public java.lang.CharSequence getGlobalExpression() {
      return global_expression;
    }
    
    /** Sets the value of the 'global_expression' field */
    public avro.java.gpudb.bulk_select_request.Builder setGlobalExpression(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.global_expression = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'global_expression' field has been set */
    public boolean hasGlobalExpression() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'global_expression' field */
    public avro.java.gpudb.bulk_select_request.Builder clearGlobalExpression() {
      global_expression = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'expressions' field */
    public java.util.List<java.lang.CharSequence> getExpressions() {
      return expressions;
    }
    
    /** Sets the value of the 'expressions' field */
    public avro.java.gpudb.bulk_select_request.Builder setExpressions(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.expressions = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'expressions' field has been set */
    public boolean hasExpressions() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'expressions' field */
    public avro.java.gpudb.bulk_select_request.Builder clearExpressions() {
      expressions = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'params' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getParams() {
      return params;
    }
    
    /** Sets the value of the 'params' field */
    public avro.java.gpudb.bulk_select_request.Builder setParams(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.params = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'params' field has been set */
    public boolean hasParams() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'params' field */
    public avro.java.gpudb.bulk_select_request.Builder clearParams() {
      params = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'user_auth_string' field */
    public java.lang.CharSequence getUserAuthString() {
      return user_auth_string;
    }
    
    /** Sets the value of the 'user_auth_string' field */
    public avro.java.gpudb.bulk_select_request.Builder setUserAuthString(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.user_auth_string = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'user_auth_string' field has been set */
    public boolean hasUserAuthString() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'user_auth_string' field */
    public avro.java.gpudb.bulk_select_request.Builder clearUserAuthString() {
      user_auth_string = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public bulk_select_request build() {
      try {
        bulk_select_request record = new bulk_select_request();
        record.set_id = fieldSetFlags()[0] ? this.set_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.global_expression = fieldSetFlags()[1] ? this.global_expression : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.expressions = fieldSetFlags()[2] ? this.expressions : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.params = fieldSetFlags()[3] ? this.params : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[3]);
        record.user_auth_string = fieldSetFlags()[4] ? this.user_auth_string : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
