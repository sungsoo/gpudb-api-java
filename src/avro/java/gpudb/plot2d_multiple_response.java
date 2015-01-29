/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class plot2d_multiple_response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"plot2d_multiple_response\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"width\",\"type\":\"double\"},{\"name\":\"height\",\"type\":\"double\"},{\"name\":\"bg_color\",\"type\":\"long\"},{\"name\":\"image_data\",\"type\":\"bytes\"}]}");
  @Deprecated public double width;
  @Deprecated public double height;
  @Deprecated public long bg_color;
  @Deprecated public java.nio.ByteBuffer image_data;

  /**
   * Default constructor.
   */
  public plot2d_multiple_response() {}

  /**
   * All-args constructor.
   */
  public plot2d_multiple_response(java.lang.Double width, java.lang.Double height, java.lang.Long bg_color, java.nio.ByteBuffer image_data) {
    this.width = width;
    this.height = height;
    this.bg_color = bg_color;
    this.image_data = image_data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return width;
    case 1: return height;
    case 2: return bg_color;
    case 3: return image_data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: width = (java.lang.Double)value$; break;
    case 1: height = (java.lang.Double)value$; break;
    case 2: bg_color = (java.lang.Long)value$; break;
    case 3: image_data = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'width' field.
   */
  public java.lang.Double getWidth() {
    return width;
  }

  /**
   * Sets the value of the 'width' field.
   * @param value the value to set.
   */
  public void setWidth(java.lang.Double value) {
    this.width = value;
  }

  /**
   * Gets the value of the 'height' field.
   */
  public java.lang.Double getHeight() {
    return height;
  }

  /**
   * Sets the value of the 'height' field.
   * @param value the value to set.
   */
  public void setHeight(java.lang.Double value) {
    this.height = value;
  }

  /**
   * Gets the value of the 'bg_color' field.
   */
  public java.lang.Long getBgColor() {
    return bg_color;
  }

  /**
   * Sets the value of the 'bg_color' field.
   * @param value the value to set.
   */
  public void setBgColor(java.lang.Long value) {
    this.bg_color = value;
  }

  /**
   * Gets the value of the 'image_data' field.
   */
  public java.nio.ByteBuffer getImageData() {
    return image_data;
  }

  /**
   * Sets the value of the 'image_data' field.
   * @param value the value to set.
   */
  public void setImageData(java.nio.ByteBuffer value) {
    this.image_data = value;
  }

  /** Creates a new plot2d_multiple_response RecordBuilder */
  public static avro.java.gpudb.plot2d_multiple_response.Builder newBuilder() {
    return new avro.java.gpudb.plot2d_multiple_response.Builder();
  }
  
  /** Creates a new plot2d_multiple_response RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.plot2d_multiple_response.Builder newBuilder(avro.java.gpudb.plot2d_multiple_response.Builder other) {
    return new avro.java.gpudb.plot2d_multiple_response.Builder(other);
  }
  
  /** Creates a new plot2d_multiple_response RecordBuilder by copying an existing plot2d_multiple_response instance */
  public static avro.java.gpudb.plot2d_multiple_response.Builder newBuilder(avro.java.gpudb.plot2d_multiple_response other) {
    return new avro.java.gpudb.plot2d_multiple_response.Builder(other);
  }
  
  /**
   * RecordBuilder for plot2d_multiple_response instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<plot2d_multiple_response>
    implements org.apache.avro.data.RecordBuilder<plot2d_multiple_response> {

    private double width;
    private double height;
    private long bg_color;
    private java.nio.ByteBuffer image_data;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.plot2d_multiple_response.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.plot2d_multiple_response.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing plot2d_multiple_response instance */
    private Builder(avro.java.gpudb.plot2d_multiple_response other) {
            super(avro.java.gpudb.plot2d_multiple_response.SCHEMA$);
      if (isValidValue(fields()[0], other.width)) {
        this.width = (java.lang.Double) data().deepCopy(fields()[0].schema(), other.width);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.height)) {
        this.height = (java.lang.Double) data().deepCopy(fields()[1].schema(), other.height);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bg_color)) {
        this.bg_color = (java.lang.Long) data().deepCopy(fields()[2].schema(), other.bg_color);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.image_data)) {
        this.image_data = (java.nio.ByteBuffer) data().deepCopy(fields()[3].schema(), other.image_data);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'width' field */
    public java.lang.Double getWidth() {
      return width;
    }
    
    /** Sets the value of the 'width' field */
    public avro.java.gpudb.plot2d_multiple_response.Builder setWidth(double value) {
      validate(fields()[0], value);
      this.width = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'width' field has been set */
    public boolean hasWidth() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'width' field */
    public avro.java.gpudb.plot2d_multiple_response.Builder clearWidth() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'height' field */
    public java.lang.Double getHeight() {
      return height;
    }
    
    /** Sets the value of the 'height' field */
    public avro.java.gpudb.plot2d_multiple_response.Builder setHeight(double value) {
      validate(fields()[1], value);
      this.height = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'height' field has been set */
    public boolean hasHeight() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'height' field */
    public avro.java.gpudb.plot2d_multiple_response.Builder clearHeight() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'bg_color' field */
    public java.lang.Long getBgColor() {
      return bg_color;
    }
    
    /** Sets the value of the 'bg_color' field */
    public avro.java.gpudb.plot2d_multiple_response.Builder setBgColor(long value) {
      validate(fields()[2], value);
      this.bg_color = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'bg_color' field has been set */
    public boolean hasBgColor() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'bg_color' field */
    public avro.java.gpudb.plot2d_multiple_response.Builder clearBgColor() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'image_data' field */
    public java.nio.ByteBuffer getImageData() {
      return image_data;
    }
    
    /** Sets the value of the 'image_data' field */
    public avro.java.gpudb.plot2d_multiple_response.Builder setImageData(java.nio.ByteBuffer value) {
      validate(fields()[3], value);
      this.image_data = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'image_data' field has been set */
    public boolean hasImageData() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'image_data' field */
    public avro.java.gpudb.plot2d_multiple_response.Builder clearImageData() {
      image_data = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public plot2d_multiple_response build() {
      try {
        plot2d_multiple_response record = new plot2d_multiple_response();
        record.width = fieldSetFlags()[0] ? this.width : (java.lang.Double) defaultValue(fields()[0]);
        record.height = fieldSetFlags()[1] ? this.height : (java.lang.Double) defaultValue(fields()[1]);
        record.bg_color = fieldSetFlags()[2] ? this.bg_color : (java.lang.Long) defaultValue(fields()[2]);
        record.image_data = fieldSetFlags()[3] ? this.image_data : (java.nio.ByteBuffer) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
