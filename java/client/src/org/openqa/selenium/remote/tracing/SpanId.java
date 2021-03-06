// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.openqa.selenium.remote.tracing;

import org.openqa.selenium.internal.Require;

import java.util.Objects;

public class SpanId {

  private final Object underlyingId;

  public SpanId(Object underlyingId) {
    this.underlyingId = Require.nonNull("Underlying id", underlyingId);
  }

  @Override
  public String toString() {
    return underlyingId.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof SpanId)) {
      return false;
    }
    SpanId that = (SpanId) o;
    return Objects.equals(this.underlyingId, that.underlyingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(underlyingId);
  }
}
