/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.iotdb.commons.model;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public class ModelInformation {

  private String modelId;
  private ModelTask modelTask;
  private ModelState modelState;

  private List<String> queryExpressions;
  private String queryFilter;

  private boolean isAuto;

  private Map<String, TrailInformation> trailMap;

  private String bestTrailId;
  private String modelPath;

  public String getModelId() {
    return modelId;
  }

  public boolean isAuto() {
    return isAuto;
  }

  public void serialize(DataOutputStream stream) {}

  public void serialize(FileOutputStream stream) {}

  public static ModelInformation deserialize(InputStream stream) {
    return null;
  }

  public static ModelInformation deserialize(ByteBuffer buffer) {
    return null;
  }
}
