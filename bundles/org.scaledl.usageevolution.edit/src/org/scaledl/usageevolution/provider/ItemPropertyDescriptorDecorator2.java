/**
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *   Erlend Stav, SINTEF - replaced all "thisObject" parameters with object, and removed contained object
 */
package org.scaledl.usageevolution.provider;


import java.util.Collection;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;


/**
 */
public class ItemPropertyDescriptorDecorator2 implements IItemPropertyDescriptor
{
  protected IItemPropertyDescriptor itemPropertyDescriptor;

  /**
   */
  public ItemPropertyDescriptorDecorator2(IItemPropertyDescriptor itemPropertyDescriptor)
  {
    this.itemPropertyDescriptor = itemPropertyDescriptor;
  }

  /**
   * This returns the group of properties into which this one should be placed.
   */
  public String getCategory(Object object) 
  {
    return itemPropertyDescriptor.getCategory(object);
  }

  /**
   * This returns the description to be displayed in the property sheet when this property is selected.
   */
  public String getDescription(Object object) 
  {
    return itemPropertyDescriptor.getDescription(object);
  }

  /**
   * This returns the name of the property to be displayed in the property sheet.
   */
  public String getDisplayName(Object object) 
  {
    return itemPropertyDescriptor.getDisplayName(object);
  }

  /**
   * This returns the flags used as filters in the property sheet.
   */
  public String[] getFilterFlags(Object object) 
  {
    return itemPropertyDescriptor.getFilterFlags(object);
  }

  /**
   * This returns the interface name of this property.
   * This is the key that is passed around and must uniquely identify this descriptor.
   */
  public String getId(Object object) 
  {
    return itemPropertyDescriptor.getId(object);
  }

  public Object getHelpContextIds(Object object)
  {
    return itemPropertyDescriptor.getHelpContextIds(object);
  }

  /**
   * This does the delegated job of getting the label provider for  the given object 
   */
  public IItemLabelProvider getLabelProvider(Object object) 
  {
    return itemPropertyDescriptor.getLabelProvider(object);
  }

  /**
   * This indicates whether these two property descriptors are equal.
   * It's not really clear to me how this is meant to be used, 
   * but it's a little bit like an equals test.
   */
  public boolean isCompatibleWith(Object object, Object anotherObject, IItemPropertyDescriptor anotherItemPropertyDescriptor) 
  {
    return itemPropertyDescriptor.isCompatibleWith(object, anotherObject, anotherItemPropertyDescriptor);
  }

  /**
   * This does the delegated job of getting the property value from the given object 
   */
  public Object getPropertyValue(Object object)
  {
    return itemPropertyDescriptor.getPropertyValue(object);
  }

  /**
   * This does the delegated job of determining whether the property value from the given object is set.
   */
  public boolean isPropertySet(Object object)
  {
    return itemPropertyDescriptor.isPropertySet(object);
  }

  /**
   * This does the delegated job of determining whether the property value from the given object supports set (and reset).
   */
  public boolean canSetProperty(Object object)
  {
    return itemPropertyDescriptor.canSetProperty(object);
  }

  /**
   * This does the delegated job of resetting property value back to it's default value.
   */
  public void resetPropertyValue(Object object)
  {
    itemPropertyDescriptor.resetPropertyValue(object);
  }

  /**
   * This does the delegated job of setting the property to the given value.
   */
  public void setPropertyValue(Object object, Object value)
  {
    itemPropertyDescriptor.setPropertyValue(object, value);
  }

  public Object getFeature(Object object)
  {
    return itemPropertyDescriptor.getFeature(object);

  }

  public Collection<?> getChoiceOfValues(Object object)
  {
    return itemPropertyDescriptor.getChoiceOfValues(object);
  }

  /**
   * This does the delegated job of determining whether the  property represents multiple values.
   */
  public boolean isMany(Object object)
  {
    return itemPropertyDescriptor.isMany(object);
  }
  
  /**
   * This does the delegated job of determining whether the property's value consists of multi-line text.
   * @since 2.2.0
   */
  public boolean isMultiLine(Object object)
  {
    return itemPropertyDescriptor.isMultiLine(object);
  }

  /**
   * This does the delegated job of determining the choices for this property should be sorted for display.
   * @since 2.2.0
   */
  public boolean isSortChoices(Object object)
  {
    return itemPropertyDescriptor.isSortChoices(object);
  }
}
