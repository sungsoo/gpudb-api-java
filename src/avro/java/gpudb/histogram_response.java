/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class histogram_response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"histogram_response\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"counts\",\"type\":{\"type\":\"array\",\"items\":\"double\"}},{\"name\":\"end\",\"type\":\"double\"},{\"name\":\"start\",\"type\":\"double\"}]}");
  @Deprecated public java.util.List<java.lang.Double> counts;
  @Deprecated public double end;
  @Deprecated public double start;

  /**
   * Default constructor.
   */
  public histogram_response() {}

  /**
   * All-args constructor.
   */
  public histogram_response(java.util.List<java.lang.Double> counts, java.lang.Double end, java.lang.Double start) {
    this.counts = counts;
    this.end = end;
    this.start = start;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return counts;
    case 1: return end;
    case 2: return start;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: counts = (java.util.List<java.lang.Double>)value$; break;
    case 1: end = (java.lang.Double)value$; break;
    case 2: start = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'counts' field.
   */
  public java.util.List<java.lang.Double> getCounts() {
    return counts;
  }

  /**
   * Sets the value of the 'counts' field.
   * @param value the value to set.
   */
  public void setCounts(java.util.List<java.lang.Double> value) {
    this.counts = value;
  }

  /**
   * Gets the value of the 'end' field.
   */
  public java.lang.Double getEnd() {
    return end;
  }

  /**
   * Sets the value of the 'end' field.
   * @param value the value to set.
   */
  public void setEnd(java.lang.Double value) {
    this.end = value;
  }

  /**
   * Gets the value of the 'start' field.
   */
  public java.lang.Double getStart() {
    return start;
  }

  /**
   * Sets the value of the 'start' field.
   * @param value the value to set.
   */
  public void setStart(java.lang.Double value) {
    this.start = value;
  }

  /** Creates a new histogram_response RecordBuilder */
  public static avro.java.gpudb.histogram_response.Builder newBuilder() {
    return new avro.java.gpudb.histogram_response.Builder();
  }
  
  /** Creates a new histogram_response RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.histogram_response.Builder newBuilder(avro.java.gpudb.histogram_response.Builder other) {
    return new avro.java.gpudb.histogram_response.Builder(other);
  }
  
  /** Creates a new histogram_response RecordBuilder by copying an existing histogram_response instance */
  public static avro.java.gpudb.histogram_response.Builder newBuilder(avro.java.gpudb.histogram_response other) {
    return new avro.java.gpudb.histogram_response.Builder(other);
  }
  
  /**
   * RecordBuilder for histogram_response instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<histogram_response>
    implements org.apache.avro.data.RecordBuilder<histogram_response> {

    private java.util.List<java.lang.Double> counts;
    private double end;
    private double start;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.histogram_response.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.histogram_response.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing histogram_response instance */
    private Builder(avro.java.gpudb.histogram_response other) {
            super(avro.java.gpudb.histogram_response.SCHEMA$);
      if (isValidValue(fields()[0], other.counts)) {
        this.counts = (java.util.List<java.lang.Double>) data().deepCopy(fields()[0].schema(), other.counts);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.end)) {
        this.end = (java.lang.Double) data().deepCopy(fields()[1].schema(), other.end);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.start)) {
        this.start = (java.lang.Double) data().deepCopy(fields()[2].schema(), other.start);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'counts' field */
    public java.util.List<java.lang.Double> getCounts() {
      return counts;
    }
    
    /** Sets the value of the 'counts' field */
    public avro.java.gpudb.histogram_response.Builder setCounts(java.util.List<java.lang.Double> value) {
      validate(fields()[0], value);
      this.counts = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'counts' field has been set */
    public boolean hasCounts() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'counts' field */
    public avro.java.gpudb.histogram_response.Builder clearCounts() {
      counts = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'end' field */
    public java.lang.Double getEnd() {
      return end;
    }
    
    /** Sets the value of the 'end' field */
    public avro.java.gpudb.histogram_response.Builder setEnd(double value) {
      validate(fields()[1], value);
      this.end = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'end' field has been set */
    public boolean hasEnd() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'end' field */
    public avro.java.gpudb.histogram_response.Builder clearEnd() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'start' field */
    public java.lang.Double getStart() {
      return start;
    }
    
    /** Sets the value of the 'start' field */
    public avro.java.gpudb.histogram_response.Builder setStart(double value) {
      validate(fields()[2], value);
      this.start = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'start' field has been set */
    public boolean hasStart() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'start' field */
    public avro.java.gpudb.histogram_response.Builder clearStart() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public histogram_response build() {
      try {
        histogram_response record = new histogram_response();
        record.counts = fieldSetFlags()[0] ? this.counts : (java.util.List<java.lang.Double>) defaultValue(fields()[0]);
        record.end = fieldSetFlags()[1] ? this.end : (java.lang.Double) defaultValue(fields()[1]);
        record.start = fieldSetFlags()[2] ? this.start : (java.lang.Double) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
