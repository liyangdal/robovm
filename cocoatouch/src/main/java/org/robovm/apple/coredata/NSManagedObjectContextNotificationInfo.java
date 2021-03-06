/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coredata;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
@Marshaler(NSManagedObjectContextNotificationInfo.Marshaler.class)
/*<annotations>*/@Library("CoreData")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSManagedObjectContextNotificationInfo/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Marshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static NSManagedObjectContextNotificationInfo toObject(Class<NSManagedObjectContextNotificationInfo> cls, long handle, long flags) {
            NSDictionary<NSString, NSObject> o = (NSDictionary<NSString, NSObject>) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new NSManagedObjectContextNotificationInfo(o);
        }
        @MarshalsPointer
        public static long toNative(NSManagedObjectContextNotificationInfo o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    
    /*<ptr>*/
    /*</ptr>*/
    private NSDictionary<NSString, NSObject> data;
    
    protected NSManagedObjectContextNotificationInfo(NSDictionary<NSString, NSObject> data) {
        this.data = data;
    }
    /*<bind>*/static { Bro.bind(NSManagedObjectContextNotificationInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public NSDictionary<NSString, NSObject> getDictionary() {
        return data;
    }
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @SuppressWarnings("unchecked")
    public NSSet<NSManagedObject> getInsertedObjects() {
        if (data.containsKey(InsertedObjectsKey())) {
            NSSet<NSManagedObject> val = (NSSet<NSManagedObject>)data.get(InsertedObjectsKey());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @SuppressWarnings("unchecked")
    public NSSet<NSManagedObject> getUpdatedObjects() {
        if (data.containsKey(UpdatedObjectsKey())) {
            NSSet<NSManagedObject> val = (NSSet<NSManagedObject>)data.get(UpdatedObjectsKey());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @SuppressWarnings("unchecked")
    public NSSet<NSManagedObject> getDeletedObjects() {
        if (data.containsKey(DeletedObjectsKey())) {
            NSSet<NSManagedObject> val = (NSSet<NSManagedObject>)data.get(DeletedObjectsKey());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @SuppressWarnings("unchecked")
    public NSSet<NSManagedObject> getRefreshedObjects() {
        if (data.containsKey(RefreshedObjectsKey())) {
            NSSet<NSManagedObject> val = (NSSet<NSManagedObject>)data.get(RefreshedObjectsKey());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @SuppressWarnings("unchecked")
    public NSSet<NSManagedObject> getInvalidatedObjects() {
        if (data.containsKey(InvalidatedObjectsKey())) {
            NSSet<NSManagedObject> val = (NSSet<NSManagedObject>)data.get(InvalidatedObjectsKey());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @SuppressWarnings("unchecked")
    public NSArray<NSManagedObjectID> getAllInvalidatedObjects() {
        if (data.containsKey(InvalidatedAllObjectsKey())) {
            NSArray<NSManagedObjectID> val = (NSArray<NSManagedObjectID>)data.get(InvalidatedAllObjectsKey());
            return val;
        }
        return null;
    }
    /*<methods>*/
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="NSInsertedObjectsKey", optional=true)
    protected static native NSString InsertedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="NSUpdatedObjectsKey", optional=true)
    protected static native NSString UpdatedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="NSDeletedObjectsKey", optional=true)
    protected static native NSString DeletedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="NSRefreshedObjectsKey", optional=true)
    protected static native NSString RefreshedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="NSInvalidatedObjectsKey", optional=true)
    protected static native NSString InvalidatedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="NSInvalidatedAllObjectsKey", optional=true)
    protected static native NSString InvalidatedAllObjectsKey();
    /*</methods>*/
    @Override
    public String toString() {
        if (data != null) return data.toString();
        return super.toString();
    }
}
