/* ----------------------------------------------------------------------------
   The Kiwi Toolkit
   Copyright (C) 1998-2003 Mark A. Lindner

   This file is part of Kiwi.
   
   This library is free software; you can redistribute it and/or
   modify it under the terms of the GNU Library General Public
   License as published by the Free Software Foundation; either
   version 2 of the License, or (at your option) any later version.

   This library is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   Library General Public License for more details.

   You should have received a copy of the GNU Library General Public
   License along with this library; if not, write to the Free
   Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 
   The author may be contacted at:
   
   mark_a_lindner@yahoo.com
   ----------------------------------------------------------------------------
   $Log: Counter.java,v $
   Revision 1.4  2003/01/19 09:42:38  markl
   Javadoc & comment header updates.

   Revision 1.3  2001/03/12 02:57:38  markl
   Source code cleanup.

   Revision 1.2  1999/01/10 03:41:46  markl
   added GPL header & RCS tag
   ----------------------------------------------------------------------------
*/

package kiwi.util;

/** An integer counter object.
  *
  * @author Mark Lindner
  */

public class Counter extends IntegerHolder
  {

  /** Construct a new <code>Counter</code> with a specified initial value.
    *
    * @param value The initial value.
    */
  
  public Counter(int value)
    {
    super(value);
    }

  /** Construct a new <code>Counter</code> with an initial value of 0.
    */
  
  public Counter()
    {
    super();
    }

  /** Increment the counter by 1.
    */
  
  public synchronized final void increment()
    {
    value++;
    }

  /** Decrement the counter by 1.
    */
  
  public synchronized final void decrement()
    {
    value--;
    }
  
  }

/* end of source file */
