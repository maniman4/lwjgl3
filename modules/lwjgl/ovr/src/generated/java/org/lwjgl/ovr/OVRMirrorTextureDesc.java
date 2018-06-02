/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Description used to create a mirror texture.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Format} &ndash; one of:<br><table><tr><td>{@link OVR#OVR_FORMAT_UNKNOWN}</td><td>{@link OVR#OVR_FORMAT_B5G6R5_UNORM}</td><td>{@link OVR#OVR_FORMAT_B5G5R5A1_UNORM}</td></tr><tr><td>{@link OVR#OVR_FORMAT_B4G4R4A4_UNORM}</td><td>{@link OVR#OVR_FORMAT_R8G8B8A8_UNORM}</td><td>{@link OVR#OVR_FORMAT_R8G8B8A8_UNORM_SRGB}</td></tr><tr><td>{@link OVR#OVR_FORMAT_B8G8R8A8_UNORM}</td><td>{@link OVR#OVR_FORMAT_B8G8R8_UNORM}</td><td>{@link OVR#OVR_FORMAT_B8G8R8A8_UNORM_SRGB}</td></tr><tr><td>{@link OVR#OVR_FORMAT_B8G8R8X8_UNORM}</td><td>{@link OVR#OVR_FORMAT_B8G8R8X8_UNORM_SRGB}</td><td>{@link OVR#OVR_FORMAT_R16G16B16A16_FLOAT}</td></tr><tr><td>{@link OVR#OVR_FORMAT_R11G11B10_FLOAT}</td><td>{@link OVR#OVR_FORMAT_D16_UNORM}</td><td>{@link OVR#OVR_FORMAT_D24_UNORM_S8_UINT}</td></tr><tr><td>{@link OVR#OVR_FORMAT_D32_FLOAT}</td><td>{@link OVR#OVR_FORMAT_D32_FLOAT_S8X24_UINT}</td><td>{@link OVR#OVR_FORMAT_BC1_UNORM}</td></tr><tr><td>{@link OVR#OVR_FORMAT_BC1_UNORM_SRGB}</td><td>{@link OVR#OVR_FORMAT_BC2_UNORM}</td><td>{@link OVR#OVR_FORMAT_BC2_UNORM_SRGB}</td></tr><tr><td>{@link OVR#OVR_FORMAT_BC3_UNORM}</td><td>{@link OVR#OVR_FORMAT_BC3_UNORM_SRGB}</td><td>{@link OVR#OVR_FORMAT_BC6H_UF16}</td></tr><tr><td>{@link OVR#OVR_FORMAT_BC6H_SF16}</td><td>{@link OVR#OVR_FORMAT_BC7_UNORM}</td><td>{@link OVR#OVR_FORMAT_BC7_UNORM_SRGB}</td></tr></table></li>
 * <li>{@code MiscFlags} &ndash; {@code ovrTextureFlags}. One or more of:<br><table><tr><td>{@link OVR#ovrTextureMisc_None TextureMisc_None}</td><td>{@link OVR#ovrTextureMisc_DX_Typeless TextureMisc_DX_Typeless}</td><td>{@link OVR#ovrTextureMisc_AllowGenerateMips TextureMisc_AllowGenerateMips}</td></tr><tr><td>{@link OVR#ovrTextureMisc_ProtectedContent TextureMisc_ProtectedContent}</td><td>{@link OVR#ovrTextureMisc_AutoGenerateMips TextureMisc_AutoGenerateMips}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrMirrorTextureDesc {
 *     ovrTextureFormat Format;
 *     int Width;
 *     int Height;
 *     unsigned int MiscFlags;
 * }</code></pre>
 */
@NativeType("struct ovrMirrorTextureDesc")
public class OVRMirrorTextureDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        WIDTH,
        HEIGHT,
        MISCFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        MISCFLAGS = layout.offsetof(3);
    }

    OVRMirrorTextureDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRMirrorTextureDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRMirrorTextureDesc(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code Format} field. */
    @NativeType("ovrTextureFormat")
    public int Format() { return nFormat(address()); }
    /** Returns the value of the {@code Width} field. */
    public int Width() { return nWidth(address()); }
    /** Returns the value of the {@code Height} field. */
    public int Height() { return nHeight(address()); }
    /** Returns the value of the {@code MiscFlags} field. */
    @NativeType("unsigned int")
    public int MiscFlags() { return nMiscFlags(address()); }

    /** Sets the specified value to the {@code Format} field. */
    public OVRMirrorTextureDesc Format(@NativeType("ovrTextureFormat") int value) { nFormat(address(), value); return this; }
    /** Sets the specified value to the {@code Width} field. */
    public OVRMirrorTextureDesc Width(int value) { nWidth(address(), value); return this; }
    /** Sets the specified value to the {@code Height} field. */
    public OVRMirrorTextureDesc Height(int value) { nHeight(address(), value); return this; }
    /** Sets the specified value to the {@code MiscFlags} field. */
    public OVRMirrorTextureDesc MiscFlags(@NativeType("unsigned int") int value) { nMiscFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRMirrorTextureDesc set(
        int Format,
        int Width,
        int Height,
        int MiscFlags
    ) {
        Format(Format);
        Width(Width);
        Height(Height);
        MiscFlags(MiscFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRMirrorTextureDesc set(OVRMirrorTextureDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRMirrorTextureDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRMirrorTextureDesc malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRMirrorTextureDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRMirrorTextureDesc calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRMirrorTextureDesc} instance allocated with {@link BufferUtils}. */
    public static OVRMirrorTextureDesc create() {
        return new OVRMirrorTextureDesc(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRMirrorTextureDesc} instance for the specified memory address. */
    public static OVRMirrorTextureDesc create(long address) {
        return new OVRMirrorTextureDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRMirrorTextureDesc createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRMirrorTextureDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMirrorTextureDesc.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRMirrorTextureDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMirrorTextureDesc.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRMirrorTextureDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMirrorTextureDesc.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRMirrorTextureDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRMirrorTextureDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRMirrorTextureDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRMirrorTextureDesc} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRMirrorTextureDesc mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRMirrorTextureDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRMirrorTextureDesc callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRMirrorTextureDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRMirrorTextureDesc mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRMirrorTextureDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRMirrorTextureDesc callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRMirrorTextureDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMirrorTextureDesc.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRMirrorTextureDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMirrorTextureDesc.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRMirrorTextureDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRMirrorTextureDesc.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRMirrorTextureDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRMirrorTextureDesc.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Format}. */
    public static int nFormat(long struct) { return memGetInt(struct + OVRMirrorTextureDesc.FORMAT); }
    /** Unsafe version of {@link #Width}. */
    public static int nWidth(long struct) { return memGetInt(struct + OVRMirrorTextureDesc.WIDTH); }
    /** Unsafe version of {@link #Height}. */
    public static int nHeight(long struct) { return memGetInt(struct + OVRMirrorTextureDesc.HEIGHT); }
    /** Unsafe version of {@link #MiscFlags}. */
    public static int nMiscFlags(long struct) { return memGetInt(struct + OVRMirrorTextureDesc.MISCFLAGS); }

    /** Unsafe version of {@link #Format(int) Format}. */
    public static void nFormat(long struct, int value) { memPutInt(struct + OVRMirrorTextureDesc.FORMAT, value); }
    /** Unsafe version of {@link #Width(int) Width}. */
    public static void nWidth(long struct, int value) { memPutInt(struct + OVRMirrorTextureDesc.WIDTH, value); }
    /** Unsafe version of {@link #Height(int) Height}. */
    public static void nHeight(long struct, int value) { memPutInt(struct + OVRMirrorTextureDesc.HEIGHT, value); }
    /** Unsafe version of {@link #MiscFlags(int) MiscFlags}. */
    public static void nMiscFlags(long struct, int value) { memPutInt(struct + OVRMirrorTextureDesc.MISCFLAGS, value); }

    // -----------------------------------

    /** An array of {@link OVRMirrorTextureDesc} structs. */
    public static class Buffer extends StructBuffer<OVRMirrorTextureDesc, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRMirrorTextureDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRMirrorTextureDesc#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRMirrorTextureDesc newInstance(long address) {
            return new OVRMirrorTextureDesc(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code Format} field. */
        @NativeType("ovrTextureFormat")
        public int Format() { return OVRMirrorTextureDesc.nFormat(address()); }
        /** Returns the value of the {@code Width} field. */
        public int Width() { return OVRMirrorTextureDesc.nWidth(address()); }
        /** Returns the value of the {@code Height} field. */
        public int Height() { return OVRMirrorTextureDesc.nHeight(address()); }
        /** Returns the value of the {@code MiscFlags} field. */
        @NativeType("unsigned int")
        public int MiscFlags() { return OVRMirrorTextureDesc.nMiscFlags(address()); }

        /** Sets the specified value to the {@code Format} field. */
        public OVRMirrorTextureDesc.Buffer Format(@NativeType("ovrTextureFormat") int value) { OVRMirrorTextureDesc.nFormat(address(), value); return this; }
        /** Sets the specified value to the {@code Width} field. */
        public OVRMirrorTextureDesc.Buffer Width(int value) { OVRMirrorTextureDesc.nWidth(address(), value); return this; }
        /** Sets the specified value to the {@code Height} field. */
        public OVRMirrorTextureDesc.Buffer Height(int value) { OVRMirrorTextureDesc.nHeight(address(), value); return this; }
        /** Sets the specified value to the {@code MiscFlags} field. */
        public OVRMirrorTextureDesc.Buffer MiscFlags(@NativeType("unsigned int") int value) { OVRMirrorTextureDesc.nMiscFlags(address(), value); return this; }

    }

}