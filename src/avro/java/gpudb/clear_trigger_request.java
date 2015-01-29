/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class clear_trigger_request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"clear_trigger_request\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"trigger_id\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence trigger_id;

  /**
   * Default constructor.
   */
  public clear_trigger_request() {}

  /**
   * All-args constructor.
   */
  public clear_trigger_request(java.lang.CharSequence trigger_id) {
    this.trigger_id = trigger_id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return trigger_id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: trigger_id = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'trigger_id' field.
   */
  public java.lang.CharSequence getTriggerId() {
    return trigger_id;
  }

  /**
   * Sets the value of the 'trigger_id' field.
   * @param value the value to set.
   */
  public void setTriggerId(java.lang.CharSequence value) {
    this.trigger_id = value;
  }

  /** Creates a new clear_trigger_request RecordBuilder */
  public static avro.java.gpudb.clear_trigger_request.Builder newBuilder() {
    return new avro.java.gpudb.clear_trigger_request.Builder();
  }
  
  /** Creates a new clear_trigger_request RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.clear_trigger_request.Builder newBuilder(avro.java.gpudb.clear_trigger_request.Builder other) {
    return new avro.java.gpudb.clear_trigger_request.Builder(other);
  }
  
  /** Creates a new clear_trigger_request RecordBuilder by copying an existing clear_trigger_request instance */
  public static avro.java.gpudb.clear_trigger_request.Builder newBuilder(avro.java.gpudb.clear_trigger_request other) {
    return new avro.java.gpudb.clear_trigger_request.Builder(other);
  }
  
  /**
   * RecordBuilder for clear_trigger_request instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<clear_trigger_request>
    implements org.apache.avro.data.RecordBuilder<clear_trigger_request> {

    private java.lang.CharSequence trigger_id;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.clear_trigger_request.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.clear_trigger_request.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing clear_trigger_request instance */
    private Builder(avro.java.gpudb.clear_trigger_request other) {
            super(avro.java.gpudb.clear_trigger_request.SCHEMA$);
      if (isValidValue(fields()[0], other.trigger_id)) {
        this.trigger_id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.trigger_id);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'trigger_id' field */
    public java.lang.CharSequence getTriggerId() {
      return trigger_id;
    }
    
    /** Sets the value of the 'trigger_id' field */
    public avro.java.gpudb.clear_trigger_request.Builder setTriggerId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.trigger_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'trigger_id' field has been set */
    public boolean hasTriggerId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'trigger_id' field */
    public avro.java.gpudb.clear_trigger_request.Builder clearTriggerId() {
      trigger_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public clear_trigger_request build() {
      try {
        clear_trigger_request record = new clear_trigger_request();
        record.trigger_id = fieldSetFlags()[0] ? this.trigger_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
