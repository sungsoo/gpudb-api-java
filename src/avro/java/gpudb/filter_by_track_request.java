/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class filter_by_track_request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"filter_by_track_request\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"set_id\",\"type\":\"string\"},{\"name\":\"track_id\",\"type\":\"string\"},{\"name\":\"target_track_ids\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"params\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"result_set_id\",\"type\":\"string\"},{\"name\":\"user_auth_string\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence set_id;
  @Deprecated public java.lang.CharSequence track_id;
  @Deprecated public java.util.List<java.lang.CharSequence> target_track_ids;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params;
  @Deprecated public java.lang.CharSequence result_set_id;
  @Deprecated public java.lang.CharSequence user_auth_string;

  /**
   * Default constructor.
   */
  public filter_by_track_request() {}

  /**
   * All-args constructor.
   */
  public filter_by_track_request(java.lang.CharSequence set_id, java.lang.CharSequence track_id, java.util.List<java.lang.CharSequence> target_track_ids, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params, java.lang.CharSequence result_set_id, java.lang.CharSequence user_auth_string) {
    this.set_id = set_id;
    this.track_id = track_id;
    this.target_track_ids = target_track_ids;
    this.params = params;
    this.result_set_id = result_set_id;
    this.user_auth_string = user_auth_string;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return set_id;
    case 1: return track_id;
    case 2: return target_track_ids;
    case 3: return params;
    case 4: return result_set_id;
    case 5: return user_auth_string;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: set_id = (java.lang.CharSequence)value$; break;
    case 1: track_id = (java.lang.CharSequence)value$; break;
    case 2: target_track_ids = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: params = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 4: result_set_id = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'track_id' field.
   */
  public java.lang.CharSequence getTrackId() {
    return track_id;
  }

  /**
   * Sets the value of the 'track_id' field.
   * @param value the value to set.
   */
  public void setTrackId(java.lang.CharSequence value) {
    this.track_id = value;
  }

  /**
   * Gets the value of the 'target_track_ids' field.
   */
  public java.util.List<java.lang.CharSequence> getTargetTrackIds() {
    return target_track_ids;
  }

  /**
   * Sets the value of the 'target_track_ids' field.
   * @param value the value to set.
   */
  public void setTargetTrackIds(java.util.List<java.lang.CharSequence> value) {
    this.target_track_ids = value;
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

  /** Creates a new filter_by_track_request RecordBuilder */
  public static avro.java.gpudb.filter_by_track_request.Builder newBuilder() {
    return new avro.java.gpudb.filter_by_track_request.Builder();
  }
  
  /** Creates a new filter_by_track_request RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.filter_by_track_request.Builder newBuilder(avro.java.gpudb.filter_by_track_request.Builder other) {
    return new avro.java.gpudb.filter_by_track_request.Builder(other);
  }
  
  /** Creates a new filter_by_track_request RecordBuilder by copying an existing filter_by_track_request instance */
  public static avro.java.gpudb.filter_by_track_request.Builder newBuilder(avro.java.gpudb.filter_by_track_request other) {
    return new avro.java.gpudb.filter_by_track_request.Builder(other);
  }
  
  /**
   * RecordBuilder for filter_by_track_request instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<filter_by_track_request>
    implements org.apache.avro.data.RecordBuilder<filter_by_track_request> {

    private java.lang.CharSequence set_id;
    private java.lang.CharSequence track_id;
    private java.util.List<java.lang.CharSequence> target_track_ids;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params;
    private java.lang.CharSequence result_set_id;
    private java.lang.CharSequence user_auth_string;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.filter_by_track_request.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.filter_by_track_request.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing filter_by_track_request instance */
    private Builder(avro.java.gpudb.filter_by_track_request other) {
            super(avro.java.gpudb.filter_by_track_request.SCHEMA$);
      if (isValidValue(fields()[0], other.set_id)) {
        this.set_id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.set_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.track_id)) {
        this.track_id = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.track_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.target_track_ids)) {
        this.target_track_ids = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[2].schema(), other.target_track_ids);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.params)) {
        this.params = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[3].schema(), other.params);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.result_set_id)) {
        this.result_set_id = (java.lang.CharSequence) data().deepCopy(fields()[4].schema(), other.result_set_id);
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
    public avro.java.gpudb.filter_by_track_request.Builder setSetId(java.lang.CharSequence value) {
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
    public avro.java.gpudb.filter_by_track_request.Builder clearSetId() {
      set_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'track_id' field */
    public java.lang.CharSequence getTrackId() {
      return track_id;
    }
    
    /** Sets the value of the 'track_id' field */
    public avro.java.gpudb.filter_by_track_request.Builder setTrackId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.track_id = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'track_id' field has been set */
    public boolean hasTrackId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'track_id' field */
    public avro.java.gpudb.filter_by_track_request.Builder clearTrackId() {
      track_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'target_track_ids' field */
    public java.util.List<java.lang.CharSequence> getTargetTrackIds() {
      return target_track_ids;
    }
    
    /** Sets the value of the 'target_track_ids' field */
    public avro.java.gpudb.filter_by_track_request.Builder setTargetTrackIds(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.target_track_ids = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'target_track_ids' field has been set */
    public boolean hasTargetTrackIds() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'target_track_ids' field */
    public avro.java.gpudb.filter_by_track_request.Builder clearTargetTrackIds() {
      target_track_ids = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'params' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getParams() {
      return params;
    }
    
    /** Sets the value of the 'params' field */
    public avro.java.gpudb.filter_by_track_request.Builder setParams(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
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
    public avro.java.gpudb.filter_by_track_request.Builder clearParams() {
      params = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'result_set_id' field */
    public java.lang.CharSequence getResultSetId() {
      return result_set_id;
    }
    
    /** Sets the value of the 'result_set_id' field */
    public avro.java.gpudb.filter_by_track_request.Builder setResultSetId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.result_set_id = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'result_set_id' field has been set */
    public boolean hasResultSetId() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'result_set_id' field */
    public avro.java.gpudb.filter_by_track_request.Builder clearResultSetId() {
      result_set_id = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'user_auth_string' field */
    public java.lang.CharSequence getUserAuthString() {
      return user_auth_string;
    }
    
    /** Sets the value of the 'user_auth_string' field */
    public avro.java.gpudb.filter_by_track_request.Builder setUserAuthString(java.lang.CharSequence value) {
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
    public avro.java.gpudb.filter_by_track_request.Builder clearUserAuthString() {
      user_auth_string = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public filter_by_track_request build() {
      try {
        filter_by_track_request record = new filter_by_track_request();
        record.set_id = fieldSetFlags()[0] ? this.set_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.track_id = fieldSetFlags()[1] ? this.track_id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.target_track_ids = fieldSetFlags()[2] ? this.target_track_ids : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.params = fieldSetFlags()[3] ? this.params : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[3]);
        record.result_set_id = fieldSetFlags()[4] ? this.result_set_id : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.user_auth_string = fieldSetFlags()[5] ? this.user_auth_string : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
