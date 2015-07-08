package com.jumkid.live.google.geocoding;

public enum Type {

	//
	// the following types are supported and returned by the geocoder in both
	// the address type and address component type arrays:
	//

	// street_address indicates a precise street address.
	street_address,

	// route indicates a named route (such as "us 101").
	route,

	// intersection indicates a major intersection, usually of two major roads.
	intersection,

	// political indicates a political entity. usually, this type indicates a
	// polygon of some civil administration.
	political,

	// country indicates the national political entity, and is typically the
	// highest order type returned by the geocoder.
	country,

	// administrative_area_level_1 indicates a first-order civil entity below
	// the country level. within the united states, these administrative levels
	// are states. not all nations exhibit these administrative levels.
	administrative_area_level_1,

	// administrative_area_level_2 indicates a second-order civil entity below
	// the country level. within the united states, these administrative levels
	// are counties. not all nations exhibit these administrative levels.
	administrative_area_level_2,

	// administrative_area_level_3 indicates a third-order civil entity below
	// the country level. this type indicates a minor civil division. not all
	// nations exhibit these administrative levels.
	administrative_area_level_3,

	// administrative_area_level_4 indicates a fourth-order civil entity below
	// the country level. this type indicates a minor civil division. not all
	// nations exhibit these administrative levels.
	administrative_area_level_4,

	// administrative_area_level_5 indicates a fifth-order civil entity below
	// the country level. this type indicates a minor civil division. not all
	// nations exhibit these administrative levels.
	administrative_area_level_5,

	// colloquial_area indicates a commonly-used alternative name for the
	// entity.
	colloquial_area,

	// locality indicates an incorporated city or town political entity.
	locality,

	// ward indicates a specific type of japanese locality, to facilitate
	// distinction between multiple locality components within a japanese
	// address.
	ward,

	// sublocality indicates a first-order civil entity below a locality. for
	// some locations may receive one of the additional types:
	// sublocality_level_1 to sublocality_level_5. each sublocality level is a
	// civil entity. larger numbers indicate a smaller geographic area.
	sublocality,

	// neighborhood indicates a named neighborhood
	neighborhood,

	// premise indicates a named location, usually a building or collection of
	// buildings with a common name
	premise,

	// subpremise indicates a first-order entity below a named location, usually
	// a singular building within a collection of buildings with a common name
	subpremise,

	// postal_code indicates a postal code as used to address postal mail within
	// the country.
	postal_code, postal_code_prefix,

	// natural_feature indicates a prominent natural feature.
	natural_feature,

	// airport indicates an airport.
	airport,

	// park indicates a named park.
	park,

	// point_of_interest indicates a named point of interest. typically, these
	// "poi"s are prominent local entities that don't easily fit in another
	// category, such as "empire state building" or "statue of liberty."
	point_of_interest,

	//
	// in addition to the above, address components may include the types below.
	//
	// note: this list is not exhaustive, and is subject to change.
	//

	// floor indicates the floor of a building address.
	floor,

	// establishment typically indicates a place that has not yet been
	// categorized.
	establishment,

	// parking indicates a parking lot or parking structure.
	parking,

	// post_box indicates a specific postal box.
	post_box,

	// postal_town indicates a grouping of geographic areas, such as locality
	// and sublocality, used for mailing addresses in some countries.
	postal_town,

	// room indicates the room of a building address.
	room,

	// street_number indicates the precise street number.
	street_number,

	// bus_station, train_station and transit_station indicate the location of a
	// bus, train or public transit stop.
	bus_station, train_station, transit_station,

	// a catch all for cases where the enum could not be identified.
	unknown;
	
}
