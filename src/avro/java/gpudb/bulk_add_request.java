/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class bulk_add_request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"bulk_add_request\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"set_id\",\"type\":\"string\"},{\"name\":\"list\",\"type\":{\"type\":\"array\",\"items\":\"bytes\"}},{\"name\":\"list_str\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"list_encoding\",\"type\":\"string\"},{\"name\":\"params\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}");
  @Deprecated public java.lang.CharSequence set_id;
  @Deprecated public java.util.List<java.nio.ByteBuffer> list;
  @Deprecated public java.util.List<java.lang.CharSequence> list_str;
  @Deprecated public java.lang.CharSequence list_encoding;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params;

  /**
   * Default constructor.
   */
  public bulk_add_request() {}

  /**
   * All-args constructor.
   */
  public bulk_add_request(java.lang.CharSequence set_id, java.util.List<java.nio.ByteBuffer> list, java.util.List<java.lang.CharSequence> list_str, java.lang.CharSequence list_encoding, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params) {
    this.set_id = set_id;
    this.list = list;
    this.list_str = list_str;
    this.list_encoding = list_encoding;
    this.params = params;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return set_id;
    case 1: return list;
    case 2: return list_str;
    case 3: return list_encoding;
    case 4: return params;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: set_id = (java.lang.CharSequence)value$; break;
    case 1: list = (java.util.List<java.nio.ByteBuffer>)value$; break;
    case 2: list_str = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: list_encoding = (java.lang.CharSequence)value$; break;
    case 4: params = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
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
   * Gets the value of the 'list' field.
   */
  public java.util.List<java.nio.ByteBuffer> getList() {
    return list;
  }

  /**
   * Sets the value of the 'list' field.
   * @param value the value to set.
   */
  public void setList(java.util.List<java.nio.ByteBuffer> value) {
    this.list = value;
  }

  /**
   * Gets the value of the 'list_str' field.
   */
  public java.util.List<java.lang.CharSequence> getListStr() {
    return list_str;
  }

  /**
   * Sets the value of the 'list_str' field.
   * @param value the value to set.
   */
  public void setListStr(java.util.List<java.lang.CharSequence> value) {
    this.list_str = value;
  }

  /**
   * Gets the value of the 'list_encoding' field.
   */
  public java.lang.CharSequence getListEncoding() {
    return list_encoding;
  }

  /**
   * Sets the value of the 'list_encoding' field.
   * @param value the value to set.
   */
  public void setListEncoding(java.lang.CharSequence value) {
    this.list_encoding = value;
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

  /** Creates a new bulk_add_request RecordBuilder */
  public static avro.java.gpudb.bulk_add_request.Builder newBuilder() {
    return new avro.java.gpudb.bulk_add_request.Builder();
  }
  
  /** Creates a new bulk_add_request RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.bulk_add_request.Builder newBuilder(avro.java.gpudb.bulk_add_request.Builder other) {
    return new avro.java.gpudb.bulk_add_request.Builder(other);
  }
  
  /** Creates a new bulk_add_request RecordBuilder by copying an existing bulk_add_request instance */
  public static avro.java.gpudb.bulk_add_request.Builder newBuilder(avro.java.gpudb.bulk_add_request other) {
    return new avro.java.gpudb.bulk_add_request.Builder(other);
  }
  
  /**
   * RecordBuilder for bulk_add_request instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<bulk_add_request>
    implements org.apache.avro.data.RecordBuilder<bulk_add_request> {

    private java.lang.CharSequence set_id;
    private java.util.List<java.nio.ByteBuffer> list;
    private java.util.List<java.lang.CharSequence> list_str;
    private java.lang.CharSequence list_encoding;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.bulk_add_request.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.bulk_add_request.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing bulk_add_request instance */
    private Builder(avro.java.gpudb.bulk_add_request other) {
            super(avro.java.gpudb.bulk_add_request.SCHEMA$);
      if (isValidValue(fields()[0], other.set_id)) {
        this.set_id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.set_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.list)) {
        this.list = (java.util.List<java.nio.ByteBuffer>) data().deepCopy(fields()[1].schema(), other.list);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.list_str)) {
        this.list_str = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[2].schema(), other.list_str);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.list_encoding)) {
        this.list_encoding = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other.list_encoding);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.params)) {
        this.params = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[4].schema(), other.params);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'set_id' field */
    public java.lang.CharSequence getSetId() {
      return set_id;
    }
    
    /** Sets the value of the 'set_id' field */
    public avro.java.gpudb.bulk_add_request.Builder setSetId(java.lang.CharSequence value) {
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
    public avro.java.gpudb.bulk_add_request.Builder clearSetId() {
      set_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'list' field */
    public java.util.List<java.nio.ByteBuffer> getList() {
      return list;
    }
    
    /** Sets the value of the 'list' field */
    public avro.java.gpudb.bulk_add_request.Builder setList(java.util.List<java.nio.ByteBuffer> value) {
      validate(fields()[1], value);
      this.list = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'list' field has been set */
    public boolean hasList() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'list' field */
    public avro.java.gpudb.bulk_add_request.Builder clearList() {
      list = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'list_str' field */
    public java.util.List<java.lang.CharSequence> getListStr() {
      return list_str;
    }
    
    /** Sets the value of the 'list_str' field */
    public avro.java.gpudb.bulk_add_request.Builder setListStr(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.list_str = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'list_str' field has been set */
    public boolean hasListStr() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'list_str' field */
    public avro.java.gpudb.bulk_add_request.Builder clearListStr() {
      list_str = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'list_encoding' field */
    public java.lang.CharSequence getListEncoding() {
      return list_encoding;
    }
    
    /** Sets the value of the 'list_encoding' field */
    public avro.java.gpudb.bulk_add_request.Builder setListEncoding(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.list_encoding = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'list_encoding' field has been set */
    public boolean hasListEncoding() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'list_encoding' field */
    public avro.java.gpudb.bulk_add_request.Builder clearListEncoding() {
      list_encoding = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'params' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getParams() {
      return params;
    }
    
    /** Sets the value of the 'params' field */
    public avro.java.gpudb.bulk_add_request.Builder setParams(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.params = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'params' field has been set */
    public boolean hasParams() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'params' field */
    public avro.java.gpudb.bulk_add_request.Builder clearParams() {
      params = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public bulk_add_request build() {
      try {
        bulk_add_request record = new bulk_add_request();
        record.set_id = fieldSetFlags()[0] ? this.set_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.list = fieldSetFlags()[1] ? this.list : (java.util.List<java.nio.ByteBuffer>) defaultValue(fields()[1]);
        record.list_str = fieldSetFlags()[2] ? this.list_str : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.list_encoding = fieldSetFlags()[3] ? this.list_encoding : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.params = fieldSetFlags()[4] ? this.params : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
