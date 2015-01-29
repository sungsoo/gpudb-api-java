/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class get_trigger_info_response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"get_trigger_info_response\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"trigger_map\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":\"string\"}}}]}");
  @Deprecated public java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> trigger_map;

  /**
   * Default constructor.
   */
  public get_trigger_info_response() {}

  /**
   * All-args constructor.
   */
  public get_trigger_info_response(java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> trigger_map) {
    this.trigger_map = trigger_map;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return trigger_map;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: trigger_map = (java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'trigger_map' field.
   */
  public java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> getTriggerMap() {
    return trigger_map;
  }

  /**
   * Sets the value of the 'trigger_map' field.
   * @param value the value to set.
   */
  public void setTriggerMap(java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> value) {
    this.trigger_map = value;
  }

  /** Creates a new get_trigger_info_response RecordBuilder */
  public static avro.java.gpudb.get_trigger_info_response.Builder newBuilder() {
    return new avro.java.gpudb.get_trigger_info_response.Builder();
  }
  
  /** Creates a new get_trigger_info_response RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.get_trigger_info_response.Builder newBuilder(avro.java.gpudb.get_trigger_info_response.Builder other) {
    return new avro.java.gpudb.get_trigger_info_response.Builder(other);
  }
  
  /** Creates a new get_trigger_info_response RecordBuilder by copying an existing get_trigger_info_response instance */
  public static avro.java.gpudb.get_trigger_info_response.Builder newBuilder(avro.java.gpudb.get_trigger_info_response other) {
    return new avro.java.gpudb.get_trigger_info_response.Builder(other);
  }
  
  /**
   * RecordBuilder for get_trigger_info_response instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<get_trigger_info_response>
    implements org.apache.avro.data.RecordBuilder<get_trigger_info_response> {

    private java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> trigger_map;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.get_trigger_info_response.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.get_trigger_info_response.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing get_trigger_info_response instance */
    private Builder(avro.java.gpudb.get_trigger_info_response other) {
            super(avro.java.gpudb.get_trigger_info_response.SCHEMA$);
      if (isValidValue(fields()[0], other.trigger_map)) {
        this.trigger_map = (java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>) data().deepCopy(fields()[0].schema(), other.trigger_map);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'trigger_map' field */
    public java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> getTriggerMap() {
      return trigger_map;
    }
    
    /** Sets the value of the 'trigger_map' field */
    public avro.java.gpudb.get_trigger_info_response.Builder setTriggerMap(java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> value) {
      validate(fields()[0], value);
      this.trigger_map = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'trigger_map' field has been set */
    public boolean hasTriggerMap() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'trigger_map' field */
    public avro.java.gpudb.get_trigger_info_response.Builder clearTriggerMap() {
      trigger_map = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public get_trigger_info_response build() {
      try {
        get_trigger_info_response record = new get_trigger_info_response();
        record.trigger_map = fieldSetFlags()[0] ? this.trigger_map : (java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}