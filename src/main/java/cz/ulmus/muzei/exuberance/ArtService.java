/*
 * Copyright 2014 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	 http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cz.ulmus.muzei.exuberance;

import retrofit.http.GET;

interface ArtService {
	@GET("/api-random")
	PhotoResponse getRandomPhoto();

	static class PhotoResponse {
		Photo photo;
	}

	static class Photo {
		String id;
		String name;
		String url;
		String source;
		String author;
	}
}
