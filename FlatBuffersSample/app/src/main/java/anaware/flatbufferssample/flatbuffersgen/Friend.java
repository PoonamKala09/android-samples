package anaware.flatbufferssample.flatbuffersgen;// automatically generated, do not modify

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Friend extends Table {
  public static Friend getRootAsFriend(ByteBuffer _bb) { return getRootAsFriend(_bb, new Friend()); }
  public static Friend getRootAsFriend(ByteBuffer _bb, Friend obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Friend __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }

  public static int createFriend(FlatBufferBuilder builder,
      long id,
      int nameOffset) {
    builder.startObject(2);
    Friend.addId(builder, id);
    Friend.addName(builder, nameOffset);
    return Friend.endFriend(builder);
  }

  public static void startFriend(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static int endFriend(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

