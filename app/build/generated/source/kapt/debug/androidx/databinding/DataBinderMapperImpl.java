package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new in.srntech90.demo.DataBinderMapperImpl());
  }
}
