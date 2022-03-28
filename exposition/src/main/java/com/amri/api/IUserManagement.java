package com.amri.api;

import com.amri.api.dto.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author HAM
 */
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Found the User",
                content = { @Content(mediaType = "application/json",
                        schema = @Schema(implementation = User.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid request",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "User not found",
                content = @Content) })
@Tag(name="Users Management", description = "Management of all User: Add, delete, modify, check...")
public interface IUserManagement {

    @Operation( description = "Get All User", summary = "Get Users")
    ResponseEntity<List<User>> getUsers();
}
