/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class select_update_response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"select_update_response\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"count\",\"type\":\"long\"}]}");
  @Deprecated public long count;

  /**
   * Default constructor.
   */
  public select_update_response() {}

  /**
   * All-args constructor.
   */
  public select_update_response(java.lang.Long count) {
    this.count = count;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return count;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: count = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'count' field.
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * Sets the value of the 'count' field.
   * @param value the value to set.
   */
  public void setCount(java.lang.Long value) {
    this.count = value;
  }

  /** Creates a new select_update_response RecordBuilder */
  public static avro.java.gpudb.select_update_response.Builder newBuilder() {
    return new avro.java.gpudb.select_update_response.Builder();
  }
  
  /** Creates a new select_update_response RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.select_update_response.Builder newBuilder(avro.java.gpudb.select_update_response.Builder other) {
    return new avro.java.gpudb.select_update_response.Builder(other);
  }
  
  /** Creates a new select_update_response RecordBuilder by copying an existing select_update_response instance */
  public static avro.java.gpudb.select_update_response.Builder newBuilder(avro.java.gpudb.select_update_response other) {
    return new avro.java.gpudb.select_update_response.Builder(other);
  }
  
  /**
   * RecordBuilder for select_update_response instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<select_update_response>
    implements org.apache.avro.data.RecordBuilder<select_update_response> {

    private long count;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.select_update_response.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.select_update_response.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing select_update_response instance */
    private Builder(avro.java.gpudb.select_update_response other) {
            super(avro.java.gpudb.select_update_response.SCHEMA$);
      if (isValidValue(fields()[0], other.count)) {
        this.count = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.count);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'count' field */
    public java.lang.Long getCount() {
      return count;
    }
    
    /** Sets the value of the 'count' field */
    public avro.java.gpudb.select_update_response.Builder setCount(long value) {
      validate(fields()[0], value);
      this.count = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'count' field has been set */
    public boolean hasCount() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'count' field */
    public avro.java.gpudb.select_update_response.Builder clearCount() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public select_update_response build() {
      try {
        select_update_response record = new select_update_response();
        record.count = fieldSetFlags()[0] ? this.count : (java.lang.Long) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
