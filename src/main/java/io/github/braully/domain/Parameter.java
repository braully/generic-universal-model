/* MIT License
* 
* Copyright (c) 2021 Braully Rocha
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
 */
package io.github.braully.domain;

import io.github.braully.persistence.IEntity;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Parameter implements IEntity {

    public static final Long ROOT_LOCAL_DIRECTORY = 1l;

    public static final Long ROOT_REMOTE_DIRECTORY = 2l;

    @Id
    Long id;

    @Basic
    String name;
    @Basic
    String value;

    @Override
    public String toString() {
        return "Parameter [id=" + id + ", name=" + name + ", value=" + value + "]";
    }
}
