/**
 * Copyright (C) 2006 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * <i>Google Guice</i> (pronounced "juice") is an ultra-lightweight dependency
 * injection framework.  Please refer to the Guice
 * <a href="http://docs.google.com/Doc?id=dd2fhx4z_5df5hw8">User's Guide</a>
 * for a gentle introduction.
 *
 * <p>The principal public APIs in this package are:
 *
 * <dl>
 * <dt>{@link cn.businessworks.common.inject.Inject}
 * <dd>The annotation you will use in your implementation classes to tell Guice
 *     where and how it should send in ("inject") the objects you depend on
 *     (your "dependencies").
 *
 * <dt>{@link cn.businessworks.common.inject.Module}
 * <dd>The interface you will implement in order to specify "bindings" --
 *     instructions for how Guice should handle injection -- for a particular
 *     set of interfaces.
 *
 * <dt>{@link cn.businessworks.common.inject.Binder}
 * <dd>The object that Guice passes into your {@link cn.businessworks.common.inject.Module}
 *     to collect these bindings.
 *
 * <dt>{@link cn.businessworks.common.inject.Provider}
 * <dd>The interface you will implement when you need to customize exactly how
 *     Guice creates instances for a particular binding.
 *
 * </dl>
 *
 */
package cn.businessworks.common.inject;