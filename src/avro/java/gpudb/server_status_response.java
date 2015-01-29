/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class server_status_response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"server_status_response\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"status_map\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}");
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> status_map;

  /**
   * Default constructor.
   */
  public server_status_response() {}

  /**
   * All-args constructor.
   */
  public server_status_response(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> status_map) {
    this.status_map = status_map;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return status_map;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: status_map = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'status_map' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getStatusMap() {
    return status_map;
  }

  /**
   * Sets the value of the 'status_map' field.
   * @param value the value to set.
   */
  public void setStatusMap(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.status_map = value;
  }

  /** Creates a new server_status_response RecordBuilder */
  public static avro.java.gpudb.server_status_response.Builder newBuilder() {
    return new avro.java.gpudb.server_status_response.Builder();
  }
  
  /** Creates a new server_status_response RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.server_status_response.Builder newBuilder(avro.java.gpudb.server_status_response.Builder other) {
    return new avro.java.gpudb.server_status_response.Builder(other);
  }
  
  /** Creates a new server_status_response RecordBuilder by copying an existing server_status_response instance */
  public static avro.java.gpudb.server_status_response.Builder newBuilder(avro.java.gpudb.server_status_response other) {
    return new avro.java.gpudb.server_status_response.Builder(other);
  }
  
  /**
   * RecordBuilder for server_status_response instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<server_status_response>
    implements org.apache.avro.data.RecordBuilder<server_status_response> {

    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> status_map;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.server_status_response.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.server_status_response.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing server_status_response instance */
    private Builder(avro.java.gpudb.server_status_response other) {
            super(avro.java.gpudb.server_status_response.SCHEMA$);
      if (isValidValue(fields()[0], other.status_map)) {
        this.status_map = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[0].schema(), other.status_map);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'status_map' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getStatusMap() {
      return status_map;
    }
    
    /** Sets the value of the 'status_map' field */
    public avro.java.gpudb.server_status_response.Builder setStatusMap(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.status_map = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'status_map' field has been set */
    public boolean hasStatusMap() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'status_map' field */
    public avro.java.gpudb.server_status_response.Builder clearStatusMap() {
      status_map = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public server_status_response build() {
      try {
        server_status_response record = new server_status_response();
        record.status_map = fieldSetFlags()[0] ? this.status_map : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
