/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class copy_set_response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"copy_set_response\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"new_set_id\",\"type\":\"string\"},{\"name\":\"count\",\"type\":\"int\"}]}");
  @Deprecated public java.lang.CharSequence new_set_id;
  @Deprecated public int count;

  /**
   * Default constructor.
   */
  public copy_set_response() {}

  /**
   * All-args constructor.
   */
  public copy_set_response(java.lang.CharSequence new_set_id, java.lang.Integer count) {
    this.new_set_id = new_set_id;
    this.count = count;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return new_set_id;
    case 1: return count;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: new_set_id = (java.lang.CharSequence)value$; break;
    case 1: count = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'new_set_id' field.
   */
  public java.lang.CharSequence getNewSetId() {
    return new_set_id;
  }

  /**
   * Sets the value of the 'new_set_id' field.
   * @param value the value to set.
   */
  public void setNewSetId(java.lang.CharSequence value) {
    this.new_set_id = value;
  }

  /**
   * Gets the value of the 'count' field.
   */
  public java.lang.Integer getCount() {
    return count;
  }

  /**
   * Sets the value of the 'count' field.
   * @param value the value to set.
   */
  public void setCount(java.lang.Integer value) {
    this.count = value;
  }

  /** Creates a new copy_set_response RecordBuilder */
  public static avro.java.gpudb.copy_set_response.Builder newBuilder() {
    return new avro.java.gpudb.copy_set_response.Builder();
  }
  
  /** Creates a new copy_set_response RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.copy_set_response.Builder newBuilder(avro.java.gpudb.copy_set_response.Builder other) {
    return new avro.java.gpudb.copy_set_response.Builder(other);
  }
  
  /** Creates a new copy_set_response RecordBuilder by copying an existing copy_set_response instance */
  public static avro.java.gpudb.copy_set_response.Builder newBuilder(avro.java.gpudb.copy_set_response other) {
    return new avro.java.gpudb.copy_set_response.Builder(other);
  }
  
  /**
   * RecordBuilder for copy_set_response instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<copy_set_response>
    implements org.apache.avro.data.RecordBuilder<copy_set_response> {

    private java.lang.CharSequence new_set_id;
    private int count;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.copy_set_response.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.copy_set_response.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing copy_set_response instance */
    private Builder(avro.java.gpudb.copy_set_response other) {
            super(avro.java.gpudb.copy_set_response.SCHEMA$);
      if (isValidValue(fields()[0], other.new_set_id)) {
        this.new_set_id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.new_set_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.count)) {
        this.count = (java.lang.Integer) data().deepCopy(fields()[1].schema(), other.count);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'new_set_id' field */
    public java.lang.CharSequence getNewSetId() {
      return new_set_id;
    }
    
    /** Sets the value of the 'new_set_id' field */
    public avro.java.gpudb.copy_set_response.Builder setNewSetId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.new_set_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'new_set_id' field has been set */
    public boolean hasNewSetId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'new_set_id' field */
    public avro.java.gpudb.copy_set_response.Builder clearNewSetId() {
      new_set_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'count' field */
    public java.lang.Integer getCount() {
      return count;
    }
    
    /** Sets the value of the 'count' field */
    public avro.java.gpudb.copy_set_response.Builder setCount(int value) {
      validate(fields()[1], value);
      this.count = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'count' field has been set */
    public boolean hasCount() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'count' field */
    public avro.java.gpudb.copy_set_response.Builder clearCount() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public copy_set_response build() {
      try {
        copy_set_response record = new copy_set_response();
        record.new_set_id = fieldSetFlags()[0] ? this.new_set_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.count = fieldSetFlags()[1] ? this.count : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
