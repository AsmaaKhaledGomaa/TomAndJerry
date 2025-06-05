package com.asoom.tomandjerry.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.asoom.tomandjerry.R
import com.asoom.tomandjerry.ui.theme.BackgroundColor
import com.asoom.tomandjerry.ui.theme.BackgroundWhiteColor
import com.asoom.tomandjerry.ui.theme.BorderGreyColor
import com.asoom.tomandjerry.ui.theme.LightBlueColor
import com.asoom.tomandjerry.ui.theme.MedGreyColor
import com.asoom.tomandjerry.ui.theme.PrimaryColor
import com.asoom.tomandjerry.ui.theme.TextAccentColor
import com.asoom.tomandjerry.ui.theme.TextDarkGreyColor
import com.asoom.tomandjerry.ui.theme.TextPrimaryColor
import com.asoom.tomandjerry.ui.theme.TextSecondaryColor
import com.asoom.tomandjerry.ui.theme.TextWhiteColor
import com.asoom.tomandjerry.ui.theme.WhiteColor
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TomStoreScreen() {
    val systemUiController = rememberSystemUiController()
    val scrollState = rememberScrollState()
    SideEffect {
        systemUiController.setSystemBarsColor(
            color = BackgroundColor.copy(alpha = 0.08F),
            darkIcons = true
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor.copy(alpha = 0.08F))
    )
    {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = BackgroundWhiteColor)
                .padding(horizontal = 16.dp),
            contentPadding = WindowInsets.statusBars.asPaddingValues(),
        ) {
            item { TomTopBar() }
            item { Spacer(modifier = Modifier.height(14.dp)) }
            item { SearchBarSection() }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { TomBanner() }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item { TomSection() }
        }
    }
}

@Composable
fun TomTopBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(R.drawable.profile_image),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(56.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            ProfileSection(
                modifier = Modifier.align(Alignment.CenterVertically)
            )

            Spacer(modifier = Modifier.weight(1f))

            NotificationIconWithBadge(3)
        }
    }
}

@Composable
fun ProfileSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .width(230.dp)
            .padding(vertical = 6.dp)
    ) {
        Text(
            text = "Hi, Jerry 👋🏻",
            fontSize = 16.sp,
            color = TextPrimaryColor,
            fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium, FontWeight.Medium)),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Which Tom do you want to buy?",
            fontSize = 14.sp,
            color = TextSecondaryColor,
            fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_regular, FontWeight.Normal)),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun NotificationIconWithBadge(badgeCount: Int) {
    BadgedBox(
        modifier = Modifier
            .size(50.dp),
        badge = {
            Badge(
                modifier = Modifier
                    .size(18.dp)
                    .align(Alignment.TopEnd),
                containerColor = PrimaryColor
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "3",
                        color = WhiteColor,
                        fontSize = 12.sp,
                        fontFamily = FontFamily(
                            Font(
                                R.font.ipm_plex_sans_arabic_semi_bold,
                                FontWeight.SemiBold
                            )
                        ),
                        modifier = Modifier
                            .align(Alignment.Center)
                            .offset(y = (-.4).dp),
                    )
                }
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .border(
                    width = 1.dp,
                    color = BorderGreyColor.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(12.dp)
                )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.notification_ic),
                contentDescription = "Notification",
                modifier = Modifier
                    .size(30.dp)
                    .align(Alignment.Center)
            )
        }
    }
}

@Composable
fun SearchBarSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(BackgroundWhiteColor),
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
        ) {
            SearchBarView()
        }

        Spacer(modifier = Modifier.width(8.dp))

        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(60.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.button_ic),
                contentDescription = "Button Icon",
                modifier = Modifier
                    .fillMaxHeight()
                    .width(60.dp)
            )
        }
    }
}

@Composable
fun SearchBarView() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = WhiteColor,
                shape = RoundedCornerShape(16.dp)
            )
            .border(
                width = 1.dp,
                color = Color.LightGray.copy(alpha = 0.3f),
                shape = RoundedCornerShape(16.dp)
            ),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.search_ic),
                contentDescription = "Search",
                tint = MedGreyColor,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            BasicTextField(
                value = "",
                onValueChange = { },
                singleLine = true,
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Black
                ),
                modifier = Modifier.fillMaxWidth(),
                decorationBox = {
                    Text(
                        text = "Search about tom ...",
                        fontSize = 14.sp,
                        overflow = TextOverflow.Ellipsis,
                        color = MedGreyColor
                    )
                }
            )
        }
    }
}

@Composable
fun TomBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 108.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight(1f)
                .heightIn(min = 110.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(18.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF03446A), Color(0xFF0685D0)),
                        start = Offset(0f, 0f),
                        end = Offset(1000f, 1000f)
                    )
                )
                .align(Alignment.BottomCenter)
        )
        {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(.72f)
                    .padding(vertical = 12.dp)
                    .padding(start = 12.dp)
                    .zIndex(1f)
            ) {
                Text(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth(),
                    text = "Buy 1 Tom and get 2 for free",
                    fontSize = 20.sp,
                    letterSpacing = .6.sp,
                    color = TextWhiteColor,
                    overflow = TextOverflow.Ellipsis,
                    fontFamily = FontFamily(
                        Font(
                            R.font.ipm_plex_sans_arabic_semi_bold,
                            FontWeight.SemiBold
                        )
                    ),
                    maxLines = 2,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth(.85f),
                    text = "Adopt Tom! ( Free Fail-Free Guarantee)",
                    lineHeight = 22.sp,
                    fontSize = 14.sp,
                    letterSpacing = .6.sp,
                    color = TextWhiteColor.copy(alpha = 0.8f),
                    overflow = TextOverflow.Ellipsis,
                    fontFamily = FontFamily(
                        Font(
                            R.font.ipm_plex_sans_arabic_regular,
                            FontWeight.Normal
                        )
                    ),
                    maxLines = 2,
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                modifier = Modifier
                    .size(width = 152.dp, height = 125.dp)
                    .graphicsLayer {
                        rotationZ = 110f
                    }
                    .offset(x = 12.dp, y = (-37).dp)
                    .zIndex(2f)
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawOval(
                        color = WhiteColor.copy(alpha = 0.08f),
                        topLeft = Offset.Zero,
                        size = size
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .size(width = 152.dp, height = 125.dp)
                    .graphicsLayer {
                        rotationZ = 106f
                    }
                    .align(Alignment.BottomEnd)
                    .offset(x = 16.dp, y = (-47).dp)
                    .zIndex(2f)
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawOval(
                        color = WhiteColor.copy(alpha = 0.08f),
                        topLeft = Offset.Zero,
                        size = size
                    )
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.tom_banner),
            contentDescription = "Tom Banner",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(.33f)
                .align(Alignment.CenterEnd)
                .offset(x = (.1).dp, y = (.15).dp)
                .zIndex(3f)
        )
    }
}

@Composable
fun TomSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 12.dp)
    ) {
        TomSectionRow()
        Spacer(modifier = Modifier.height(26.dp))
        TomSectionColumn()
    }
}

@Composable
fun TomSectionRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(38.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .wrapContentWidth()
                .height(38.dp)
                .padding(start = 2.dp),
            text = "Cheap tom section",
            fontSize = 26.sp,
            color = TextDarkGreyColor,
            letterSpacing = .5.sp,
            overflow = TextOverflow.Ellipsis,
            fontFamily = FontFamily(
                Font(
                    R.font.ipm_plex_sans_arabic_semi_bold,
                    FontWeight.SemiBold
                )
            ),
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .height(38.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "View all",
                fontSize = 16.sp,
                color = TextAccentColor,
                overflow = TextOverflow.Ellipsis,
                fontFamily = FontFamily(
                    Font(
                        R.font.ipm_plex_sans_arabic_medium,
                        FontWeight.Medium
                    )
                ),
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                modifier = Modifier.size(14.dp),
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = "Arrow Right",
                tint = PrimaryColor
            )
        }
    }
}

@Composable
fun TomSectionColumn() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(max = 1000.dp),
        contentPadding = PaddingValues(bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        userScrollEnabled = false
    ) {
        items(tomItemsList.size) { index ->
            val tomItem = tomItemsList[index]
            Box(
                modifier = Modifier
                    .height(280.dp)
                    .fillMaxWidth(),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 16.dp)
                        .heightIn(min = 219.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(color = Color.White)
                        .align(Alignment.BottomStart)
                        .padding(horizontal = 10.dp)
                        .padding(top = 115.dp, bottom = 10.dp),
                ) {
                    Text(
                        text = tomItem.title,
                        fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_semi_bold)),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        overflow = TextOverflow.Ellipsis,
                        color = TextPrimaryColor,
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        modifier = Modifier.fillMaxWidth(),
                    )
                    Text(
                        text = tomItem.description,
                        fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_regular)),
                        fontWeight = FontWeight.Normal,
                        fontSize = 13.sp,
                        lineHeight = 20.sp,
                        overflow = TextOverflow.Ellipsis,
                        color = TextSecondaryColor,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth(.9f)
                            .align(Alignment.CenterHorizontally)
                            .weight(1f)
                            .padding(bottom = 8.dp),
                    )
                    Row(
                        modifier = Modifier.height(38.dp),
                    ) {
                        Row(
                            modifier = Modifier
                                .weight(1f)
                                .height(38.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(color = LightBlueColor)
                                .padding(vertical = 9.dp, horizontal = 2.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.money_bag),
                                contentDescription = "Add to cart",
                                colorFilter = ColorFilter.tint(color = PrimaryColor),
                                modifier = Modifier
                                    .height(20.dp)
                                    .size(20.dp)
                            )
                            Spacer(Modifier.width(5.dp))
                            if (tomItem.salePrice == 0)
                                Text(
                                    text = tomItem.price.toString(),
                                    fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 14.sp,
                                    overflow = TextOverflow.Ellipsis,
                                    lineHeight = 16.sp,
                                    letterSpacing = 1.sp,
                                    color = TextAccentColor,
                                )
                            if (tomItem.salePrice != 0)
                                Text(
                                    text = tomItem.price.toString(),
                                    fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 14.sp,
                                    letterSpacing = 1.sp,
                                    lineHeight = 16.sp,
                                    overflow = TextOverflow.Ellipsis,
                                    textDecoration = TextDecoration.LineThrough,
                                    color = TextAccentColor,
                                )
                            if (tomItem.salePrice != 0)
                                Spacer(Modifier.width(3.dp))
                            if (tomItem.salePrice != 0)
                                Text(
                                    text = tomItem.salePrice.toString(),
                                    fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 14.sp,
                                    letterSpacing = 1.sp,
                                    overflow = TextOverflow.Ellipsis,
                                    lineHeight = 16.sp,
                                    color = TextAccentColor,
                                )
                            Spacer(Modifier.width(3.dp))
                            Text(
                                text = "cheeses",
                                fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp,
                                lineHeight = 16.sp,
                                letterSpacing = .5.sp,
                                overflow = TextOverflow.Ellipsis,
                                color = TextAccentColor,
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Button(
                            onClick = { },
                            modifier = Modifier.size(36.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                            contentPadding = PaddingValues(0.dp),
                            shape = RoundedCornerShape(8.dp),
                            border = BorderStroke(width = 1.dp, color = PrimaryColor),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.add_to_car_ic),
                                contentDescription = "Add to cart",
                                colorFilter = ColorFilter.tint(color = PrimaryColor),
                                modifier = Modifier.size(22.dp),
                            )
                        }
                    }
                }
                Image(
                    painter = painterResource(id = tomItem.imageId),
                    contentDescription = "Tom Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .height(130.dp)
                        .fillMaxWidth(.6f)
                        .offset(y = (-5).dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTomStoreScreen() {
    TomStoreScreen()
}

val tomItemsList = listOf(
    TomItemModel(
        imageId = R.drawable.sport_tom,
        title = "Sport Tom",
        description = "He runs 1 meter... trips over his boot.",
        price = 5,
        salePrice = 3,
    ),
    TomItemModel(
        imageId = R.drawable.tom_the_lover,
        title = "Tom the lover",
        description = "He loves one-sidedly... and is beaten by the other side.",
        price = 5,
        salePrice = 0,
    ),
    TomItemModel(
        imageId = R.drawable.tom_the_bomb,
        title = "Tom the bomb",
        description = "He blows himself up before Jerry can catch him.",
        price = 10,
        salePrice = 0,
    ),
    TomItemModel(
        imageId = R.drawable.spy_tom,
        title = "Spy Tom",
        description = "Disguises itself as a table.",
        price = 12,
        salePrice = 0,
    ),
    TomItemModel(
        imageId = R.drawable.frozen_tom,
        title = "Frozen Tom",
        description = "He was chasing Jerry, he froze after the first look",
        price = 10,
        salePrice = 0,
    ),
    TomItemModel(
        imageId = R.drawable.sleeping_tom,
        title = "Sleeping Tom",
        description = "He doesn't chase anyone, he just snores in stereo.",
        price = 10,
        salePrice = 0,
    ),
)