/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBaseInStructure {
 *     VkStructureType sType;
 *     {@link VkBaseInStructure VkBaseInStructure} * pNext;
 * }</code></pre>
 */
public class VkBaseInStructure extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    VkBaseInStructure(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkBaseInStructure} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBaseInStructure(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns a {@link VkBaseInStructure} view of the struct pointed to by the {@code pNext} field. */
    @Nullable
    @NativeType("VkBaseInStructure *")
    public VkBaseInStructure pNext() { return npNext(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBaseInStructure sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the address of the specified {@link VkBaseInStructure} to the {@code pNext} field. */
    public VkBaseInStructure pNext(@Nullable @NativeType("VkBaseInStructure *") VkBaseInStructure value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBaseInStructure set(
        int sType,
        @Nullable VkBaseInStructure pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBaseInStructure set(VkBaseInStructure src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBaseInStructure} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBaseInStructure malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkBaseInStructure} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBaseInStructure calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkBaseInStructure} instance allocated with {@link BufferUtils}. */
    public static VkBaseInStructure create() {
        return new VkBaseInStructure(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkBaseInStructure} instance for the specified memory address. */
    public static VkBaseInStructure create(long address) {
        return new VkBaseInStructure(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBaseInStructure createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkBaseInStructure.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBaseInStructure.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBaseInStructure} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBaseInStructure mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBaseInStructure} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBaseInStructure callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBaseInStructure} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBaseInStructure mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBaseInStructure} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBaseInStructure callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBaseInStructure.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    @Nullable public static VkBaseInStructure npNext(long struct) { return VkBaseInStructure.createSafe(memGetAddress(struct + VkBaseInStructure.PNEXT)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBaseInStructure.STYPE, value); }
    /** Unsafe version of {@link #pNext(VkBaseInStructure) pNext}. */
    public static void npNext(long struct, @Nullable VkBaseInStructure value) { memPutAddress(struct + VkBaseInStructure.PNEXT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkBaseInStructure} structs. */
    public static class Buffer extends StructBuffer<VkBaseInStructure, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkBaseInStructure.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBaseInStructure#SIZEOF}, and its mark will be undefined.
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
        protected VkBaseInStructure newInstance(long address) {
            return new VkBaseInStructure(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBaseInStructure.nsType(address()); }
        /** Returns a {@link VkBaseInStructure} view of the struct pointed to by the {@code pNext} field. */
        @Nullable
        @NativeType("VkBaseInStructure *")
        public VkBaseInStructure pNext() { return VkBaseInStructure.npNext(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBaseInStructure.Buffer sType(@NativeType("VkStructureType") int value) { VkBaseInStructure.nsType(address(), value); return this; }
        /** Sets the address of the specified {@link VkBaseInStructure} to the {@code pNext} field. */
        public VkBaseInStructure.Buffer pNext(@Nullable @NativeType("VkBaseInStructure *") VkBaseInStructure value) { VkBaseInStructure.npNext(address(), value); return this; }

    }

}