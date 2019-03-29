/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.workspace.shared.dto.devfile;

import java.util.List;
import java.util.Map;
import org.eclipse.che.api.core.model.workspace.devfile.Component;

/** @author Sergii Leshchenko */
public interface ComponentDto extends Component {

  @Override
  String getName();

  void setName(String name);

  ComponentDto withName(String name);

  @Override
  String getType();

  void setType(String type);

  ComponentDto withType(String type);

  // editor/plugin

  @Override
  String getId();

  void setId(String id);

  ComponentDto withId(String id);

  // k8s/OS

  @Override
  String getLocal();

  void setLocal(String local);

  ComponentDto withLocal(String local);

  @Override
  String getLocalContent();

  void setLocalContent(String localContent);

  ComponentDto withLocalContent(String localContent);

  @Override
  List<EntrypointDto> getEntrypoints();

  void setEntrypoints(List<EntrypointDto> entrypoints);

  ComponentDto withEntrypoints(List<EntrypointDto> entrypoints);

  @Override
  Map<String, String> getSelector();

  void setSelector(Map<String, String> selector);

  ComponentDto withSelector(Map<String, String> selector);

  // dockerimage

  @Override
  String getImage();

  void setImage(String image);

  ComponentDto withImage(String image);

  @Override
  String getMemoryLimit();

  void setMemoryLimit(String memoryLimit);

  ComponentDto withMemoryLimit(String memoryLimit);

  @Override
  boolean getMountSources();

  void setMountSources(boolean mountSources);

  ComponentDto withMountSources(boolean mountSources);

  @Override
  List<String> getCommand();

  void setCommand(List<String> command);

  ComponentDto withCommand(List<String> command);

  @Override
  List<String> getArgs();

  void setArgs(List<String> args);

  ComponentDto withArgs(List<String> args);

  @Override
  List<VolumeDto> getVolumes();

  void setVolumes(List<VolumeDto> volumes);

  ComponentDto withVolumes(List<VolumeDto> volumes);

  @Override
  List<EnvDto> getEnv();

  void setEnv(List<EnvDto> env);

  ComponentDto withEnv(List<EnvDto> env);

  @Override
  List<EndpointDto> getEndpoints();

  void setEndpoints(List<EndpointDto> endpoints);

  ComponentDto withEndpoints(List<EndpointDto> endpoints);
}
