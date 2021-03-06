/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class update_object_request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"update_object_request\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"set_ids\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"OBJECT_ID\",\"type\":\"string\"},{\"name\":\"object_data\",\"type\":\"bytes\"},{\"name\":\"object_data_str\",\"type\":\"string\"},{\"name\":\"object_encoding\",\"type\":\"string\"},{\"name\":\"user_auth_string\",\"type\":\"string\"}]}");
  @Deprecated public java.util.List<java.lang.CharSequence> set_ids;
  @Deprecated public java.lang.CharSequence OBJECT_ID;
  @Deprecated public java.nio.ByteBuffer object_data;
  @Deprecated public java.lang.CharSequence object_data_str;
  @Deprecated public java.lang.CharSequence object_encoding;
  @Deprecated public java.lang.CharSequence user_auth_string;

  /**
   * Default constructor.
   */
  public update_object_request() {}

  /**
   * All-args constructor.
   */
  public update_object_request(java.util.List<java.lang.CharSequence> set_ids, java.lang.CharSequence OBJECT_ID, java.nio.ByteBuffer object_data, java.lang.CharSequence object_data_str, java.lang.CharSequence object_encoding, java.lang.CharSequence user_auth_string) {
    this.set_ids = set_ids;
    this.OBJECT_ID = OBJECT_ID;
    this.object_data = object_data;
    this.object_data_str = object_data_str;
    this.object_encoding = object_encoding;
    this.user_auth_string = user_auth_string;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return set_ids;
    case 1: return OBJECT_ID;
    case 2: return object_data;
    case 3: return object_data_str;
    case 4: return object_encoding;
    case 5: return user_auth_string;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: set_ids = (java.util.List<java.lang.CharSequence>)value$; break;
    case 1: OBJECT_ID = (java.lang.CharSequence)value$; break;
    case 2: object_data = (java.nio.ByteBuffer)value$; break;
    case 3: object_data_str = (java.lang.CharSequence)value$; break;
    case 4: object_encoding = (java.lang.CharSequence)value$; break;
    case 5: user_auth_string = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'set_ids' field.
   */
  public java.util.List<java.lang.CharSequence> getSetIds() {
    return set_ids;
  }

  /**
   * Sets the value of the 'set_ids' field.
   * @param value the value to set.
   */
  public void setSetIds(java.util.List<java.lang.CharSequence> value) {
    this.set_ids = value;
  }

  /**
   * Gets the value of the 'OBJECT_ID' field.
   */
  public java.lang.CharSequence getOBJECTID() {
    return OBJECT_ID;
  }

  /**
   * Sets the value of the 'OBJECT_ID' field.
   * @param value the value to set.
   */
  public void setOBJECTID(java.lang.CharSequence value) {
    this.OBJECT_ID = value;
  }

  /**
   * Gets the value of the 'object_data' field.
   */
  public java.nio.ByteBuffer getObjectData() {
    return object_data;
  }

  /**
   * Sets the value of the 'object_data' field.
   * @param value the value to set.
   */
  public void setObjectData(java.nio.ByteBuffer value) {
    this.object_data = value;
  }

  /**
   * Gets the value of the 'object_data_str' field.
   */
  public java.lang.CharSequence getObjectDataStr() {
    return object_data_str;
  }

  /**
   * Sets the value of the 'object_data_str' field.
   * @param value the value to set.
   */
  public void setObjectDataStr(java.lang.CharSequence value) {
    this.object_data_str = value;
  }

  /**
   * Gets the value of the 'object_encoding' field.
   */
  public java.lang.CharSequence getObjectEncoding() {
    return object_encoding;
  }

  /**
   * Sets the value of the 'object_encoding' field.
   * @param value the value to set.
   */
  public void setObjectEncoding(java.lang.CharSequence value) {
    this.object_encoding = value;
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

  /** Creates a new update_object_request RecordBuilder */
  public static avro.java.gpudb.update_object_request.Builder newBuilder() {
    return new avro.java.gpudb.update_object_request.Builder();
  }
  
  /** Creates a new update_object_request RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.update_object_request.Builder newBuilder(avro.java.gpudb.update_object_request.Builder other) {
    return new avro.java.gpudb.update_object_request.Builder(other);
  }
  
  /** Creates a new update_object_request RecordBuilder by copying an existing update_object_request instance */
  public static avro.java.gpudb.update_object_request.Builder newBuilder(avro.java.gpudb.update_object_request other) {
    return new avro.java.gpudb.update_object_request.Builder(other);
  }
  
  /**
   * RecordBuilder for update_object_request instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<update_object_request>
    implements org.apache.avro.data.RecordBuilder<update_object_request> {

    private java.util.List<java.lang.CharSequence> set_ids;
    private java.lang.CharSequence OBJECT_ID;
    private java.nio.ByteBuffer object_data;
    private java.lang.CharSequence object_data_str;
    private java.lang.CharSequence object_encoding;
    private java.lang.CharSequence user_auth_string;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.update_object_request.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.update_object_request.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing update_object_request instance */
    private Builder(avro.java.gpudb.update_object_request other) {
            super(avro.java.gpudb.update_object_request.SCHEMA$);
      if (isValidValue(fields()[0], other.set_ids)) {
        this.set_ids = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[0].schema(), other.set_ids);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.OBJECT_ID)) {
        this.OBJECT_ID = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.OBJECT_ID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.object_data)) {
        this.object_data = (java.nio.ByteBuffer) data().deepCopy(fields()[2].schema(), other.object_data);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.object_data_str)) {
        this.object_data_str = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other.object_data_str);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.object_encoding)) {
        this.object_encoding = (java.lang.CharSequence) data().deepCopy(fields()[4].schema(), other.object_encoding);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.user_auth_string)) {
        this.user_auth_string = (java.lang.CharSequence) data().deepCopy(fields()[5].schema(), other.user_auth_string);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'set_ids' field */
    public java.util.List<java.lang.CharSequence> getSetIds() {
      return set_ids;
    }
    
    /** Sets the value of the 'set_ids' field */
    public avro.java.gpudb.update_object_request.Builder setSetIds(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.set_ids = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'set_ids' field has been set */
    public boolean hasSetIds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'set_ids' field */
    public avro.java.gpudb.update_object_request.Builder clearSetIds() {
      set_ids = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'OBJECT_ID' field */
    public java.lang.CharSequence getOBJECTID() {
      return OBJECT_ID;
    }
    
    /** Sets the value of the 'OBJECT_ID' field */
    public avro.java.gpudb.update_object_request.Builder setOBJECTID(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.OBJECT_ID = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'OBJECT_ID' field has been set */
    public boolean hasOBJECTID() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'OBJECT_ID' field */
    public avro.java.gpudb.update_object_request.Builder clearOBJECTID() {
      OBJECT_ID = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'object_data' field */
    public java.nio.ByteBuffer getObjectData() {
      return object_data;
    }
    
    /** Sets the value of the 'object_data' field */
    public avro.java.gpudb.update_object_request.Builder setObjectData(java.nio.ByteBuffer value) {
      validate(fields()[2], value);
      this.object_data = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'object_data' field has been set */
    public boolean hasObjectData() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'object_data' field */
    public avro.java.gpudb.update_object_request.Builder clearObjectData() {
      object_data = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'object_data_str' field */
    public java.lang.CharSequence getObjectDataStr() {
      return object_data_str;
    }
    
    /** Sets the value of the 'object_data_str' field */
    public avro.java.gpudb.update_object_request.Builder setObjectDataStr(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.object_data_str = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'object_data_str' field has been set */
    public boolean hasObjectDataStr() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'object_data_str' field */
    public avro.java.gpudb.update_object_request.Builder clearObjectDataStr() {
      object_data_str = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'object_encoding' field */
    public java.lang.CharSequence getObjectEncoding() {
      return object_encoding;
    }
    
    /** Sets the value of the 'object_encoding' field */
    public avro.java.gpudb.update_object_request.Builder setObjectEncoding(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.object_encoding = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'object_encoding' field has been set */
    public boolean hasObjectEncoding() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'object_encoding' field */
    public avro.java.gpudb.update_object_request.Builder clearObjectEncoding() {
      object_encoding = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'user_auth_string' field */
    public java.lang.CharSequence getUserAuthString() {
      return user_auth_string;
    }
    
    /** Sets the value of the 'user_auth_string' field */
    public avro.java.gpudb.update_object_request.Builder setUserAuthString(java.lang.CharSequence value) {
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
    public avro.java.gpudb.update_object_request.Builder clearUserAuthString() {
      user_auth_string = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public update_object_request build() {
      try {
        update_object_request record = new update_object_request();
        record.set_ids = fieldSetFlags()[0] ? this.set_ids : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[0]);
        record.OBJECT_ID = fieldSetFlags()[1] ? this.OBJECT_ID : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.object_data = fieldSetFlags()[2] ? this.object_data : (java.nio.ByteBuffer) defaultValue(fields()[2]);
        record.object_data_str = fieldSetFlags()[3] ? this.object_data_str : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.object_encoding = fieldSetFlags()[4] ? this.object_encoding : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.user_auth_string = fieldSetFlags()[5] ? this.user_auth_string : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
