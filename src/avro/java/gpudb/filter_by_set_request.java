/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class filter_by_set_request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"filter_by_set_request\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"set_id\",\"type\":\"string\"},{\"name\":\"result_set_id\",\"type\":\"string\"},{\"name\":\"attribute\",\"type\":\"string\"},{\"name\":\"source_set_id\",\"type\":\"string\"},{\"name\":\"source_set_attribute\",\"type\":\"string\"},{\"name\":\"user_auth_string\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence set_id;
  @Deprecated public java.lang.CharSequence result_set_id;
  @Deprecated public java.lang.CharSequence attribute;
  @Deprecated public java.lang.CharSequence source_set_id;
  @Deprecated public java.lang.CharSequence source_set_attribute;
  @Deprecated public java.lang.CharSequence user_auth_string;

  /**
   * Default constructor.
   */
  public filter_by_set_request() {}

  /**
   * All-args constructor.
   */
  public filter_by_set_request(java.lang.CharSequence set_id, java.lang.CharSequence result_set_id, java.lang.CharSequence attribute, java.lang.CharSequence source_set_id, java.lang.CharSequence source_set_attribute, java.lang.CharSequence user_auth_string) {
    this.set_id = set_id;
    this.result_set_id = result_set_id;
    this.attribute = attribute;
    this.source_set_id = source_set_id;
    this.source_set_attribute = source_set_attribute;
    this.user_auth_string = user_auth_string;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return set_id;
    case 1: return result_set_id;
    case 2: return attribute;
    case 3: return source_set_id;
    case 4: return source_set_attribute;
    case 5: return user_auth_string;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: set_id = (java.lang.CharSequence)value$; break;
    case 1: result_set_id = (java.lang.CharSequence)value$; break;
    case 2: attribute = (java.lang.CharSequence)value$; break;
    case 3: source_set_id = (java.lang.CharSequence)value$; break;
    case 4: source_set_attribute = (java.lang.CharSequence)value$; break;
    case 5: user_auth_string = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'result_set_id' field.
   */
  public java.lang.CharSequence getResultSetId() {
    return result_set_id;
  }

  /**
   * Sets the value of the 'result_set_id' field.
   * @param value the value to set.
   */
  public void setResultSetId(java.lang.CharSequence value) {
    this.result_set_id = value;
  }

  /**
   * Gets the value of the 'attribute' field.
   */
  public java.lang.CharSequence getAttribute() {
    return attribute;
  }

  /**
   * Sets the value of the 'attribute' field.
   * @param value the value to set.
   */
  public void setAttribute(java.lang.CharSequence value) {
    this.attribute = value;
  }

  /**
   * Gets the value of the 'source_set_id' field.
   */
  public java.lang.CharSequence getSourceSetId() {
    return source_set_id;
  }

  /**
   * Sets the value of the 'source_set_id' field.
   * @param value the value to set.
   */
  public void setSourceSetId(java.lang.CharSequence value) {
    this.source_set_id = value;
  }

  /**
   * Gets the value of the 'source_set_attribute' field.
   */
  public java.lang.CharSequence getSourceSetAttribute() {
    return source_set_attribute;
  }

  /**
   * Sets the value of the 'source_set_attribute' field.
   * @param value the value to set.
   */
  public void setSourceSetAttribute(java.lang.CharSequence value) {
    this.source_set_attribute = value;
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

  /** Creates a new filter_by_set_request RecordBuilder */
  public static avro.java.gpudb.filter_by_set_request.Builder newBuilder() {
    return new avro.java.gpudb.filter_by_set_request.Builder();
  }
  
  /** Creates a new filter_by_set_request RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.filter_by_set_request.Builder newBuilder(avro.java.gpudb.filter_by_set_request.Builder other) {
    return new avro.java.gpudb.filter_by_set_request.Builder(other);
  }
  
  /** Creates a new filter_by_set_request RecordBuilder by copying an existing filter_by_set_request instance */
  public static avro.java.gpudb.filter_by_set_request.Builder newBuilder(avro.java.gpudb.filter_by_set_request other) {
    return new avro.java.gpudb.filter_by_set_request.Builder(other);
  }
  
  /**
   * RecordBuilder for filter_by_set_request instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<filter_by_set_request>
    implements org.apache.avro.data.RecordBuilder<filter_by_set_request> {

    private java.lang.CharSequence set_id;
    private java.lang.CharSequence result_set_id;
    private java.lang.CharSequence attribute;
    private java.lang.CharSequence source_set_id;
    private java.lang.CharSequence source_set_attribute;
    private java.lang.CharSequence user_auth_string;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.filter_by_set_request.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.filter_by_set_request.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing filter_by_set_request instance */
    private Builder(avro.java.gpudb.filter_by_set_request other) {
            super(avro.java.gpudb.filter_by_set_request.SCHEMA$);
      if (isValidValue(fields()[0], other.set_id)) {
        this.set_id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.set_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.result_set_id)) {
        this.result_set_id = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.result_set_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attribute)) {
        this.attribute = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.attribute);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.source_set_id)) {
        this.source_set_id = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other.source_set_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.source_set_attribute)) {
        this.source_set_attribute = (java.lang.CharSequence) data().deepCopy(fields()[4].schema(), other.source_set_attribute);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.user_auth_string)) {
        this.user_auth_string = (java.lang.CharSequence) data().deepCopy(fields()[5].schema(), other.user_auth_string);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'set_id' field */
    public java.lang.CharSequence getSetId() {
      return set_id;
    }
    
    /** Sets the value of the 'set_id' field */
    public avro.java.gpudb.filter_by_set_request.Builder setSetId(java.lang.CharSequence value) {
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
    public avro.java.gpudb.filter_by_set_request.Builder clearSetId() {
      set_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'result_set_id' field */
    public java.lang.CharSequence getResultSetId() {
      return result_set_id;
    }
    
    /** Sets the value of the 'result_set_id' field */
    public avro.java.gpudb.filter_by_set_request.Builder setResultSetId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.result_set_id = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'result_set_id' field has been set */
    public boolean hasResultSetId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'result_set_id' field */
    public avro.java.gpudb.filter_by_set_request.Builder clearResultSetId() {
      result_set_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'attribute' field */
    public java.lang.CharSequence getAttribute() {
      return attribute;
    }
    
    /** Sets the value of the 'attribute' field */
    public avro.java.gpudb.filter_by_set_request.Builder setAttribute(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.attribute = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'attribute' field has been set */
    public boolean hasAttribute() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'attribute' field */
    public avro.java.gpudb.filter_by_set_request.Builder clearAttribute() {
      attribute = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'source_set_id' field */
    public java.lang.CharSequence getSourceSetId() {
      return source_set_id;
    }
    
    /** Sets the value of the 'source_set_id' field */
    public avro.java.gpudb.filter_by_set_request.Builder setSourceSetId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.source_set_id = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'source_set_id' field has been set */
    public boolean hasSourceSetId() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'source_set_id' field */
    public avro.java.gpudb.filter_by_set_request.Builder clearSourceSetId() {
      source_set_id = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'source_set_attribute' field */
    public java.lang.CharSequence getSourceSetAttribute() {
      return source_set_attribute;
    }
    
    /** Sets the value of the 'source_set_attribute' field */
    public avro.java.gpudb.filter_by_set_request.Builder setSourceSetAttribute(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.source_set_attribute = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'source_set_attribute' field has been set */
    public boolean hasSourceSetAttribute() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'source_set_attribute' field */
    public avro.java.gpudb.filter_by_set_request.Builder clearSourceSetAttribute() {
      source_set_attribute = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'user_auth_string' field */
    public java.lang.CharSequence getUserAuthString() {
      return user_auth_string;
    }
    
    /** Sets the value of the 'user_auth_string' field */
    public avro.java.gpudb.filter_by_set_request.Builder setUserAuthString(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.user_auth_string = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'user_auth_string' field has been set */
    public boolean hasUserAuthString() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'user_auth_string' field */
    public avro.java.gpudb.filter_by_set_request.Builder clearUserAuthString() {
      user_auth_string = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public filter_by_set_request build() {
      try {
        filter_by_set_request record = new filter_by_set_request();
        record.set_id = fieldSetFlags()[0] ? this.set_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.result_set_id = fieldSetFlags()[1] ? this.result_set_id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.attribute = fieldSetFlags()[2] ? this.attribute : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.source_set_id = fieldSetFlags()[3] ? this.source_set_id : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.source_set_attribute = fieldSetFlags()[4] ? this.source_set_attribute : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.user_auth_string = fieldSetFlags()[5] ? this.user_auth_string : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
