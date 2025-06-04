//package com.asoom.tomandjerry.ui.screens
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.aspectRatio
//import androidx.compose.foundation.layout.defaultMinSize
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.HorizontalDivider
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.draw.clipToBounds
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextDecoration
//import androidx.compose.ui.text.style.TextOverflow
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.tom_and_jerry.R
//import com.example.tom_and_jerry.ui.theme.BackgroundWhite
//import com.example.tom_and_jerry.ui.theme.BorderGrey
//import com.example.tom_and_jerry.ui.theme.DefaultButtonColor
//import com.example.tom_and_jerry.ui.theme.IBMPlexSansArabic
//import com.example.tom_and_jerry.ui.theme.PrimaryColor
//import com.example.tom_and_jerry.ui.theme.SecondaryColor
//import com.example.tom_and_jerry.ui.theme.TextAccentColor
//import com.example.tom_and_jerry.ui.theme.TextDarkGreyColor
//import com.example.tom_and_jerry.ui.theme.TextPrimaryColor
//import com.example.tom_and_jerry.ui.theme.TextWhiteColor
//import com.example.tom_and_jerry.ui.theme.White
//
//@Composable
//fun Screen2() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = White)
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.meal_background),
//            contentDescription = "Meal Background",
//            modifier = Modifier.fillMaxWidth(),
//            contentScale = ContentScale.FillWidth
//        )
//        Column(
//            modifier = Modifier
//                .padding(top = 162.dp)
//                .fillMaxSize()
//                .clip(shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
//                .background(color = BackgroundWhite)
//                .padding(top = 26.dp)
//        ) {
//            Column(
//                modifier = Modifier
//                    .padding(horizontal = 16.dp)
//                    .weight(1f)
//                    .verticalScroll(rememberScrollState())
//            ) {
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically,
//                ) {
//                    Column(
//                        modifier = Modifier.weight(1f)
//                    ) {
//                        Text(
//                            text = "Electric Tom pasta",
//                            fontFamily = IBMPlexSansArabic,
//                            fontWeight = FontWeight.Medium,
//                            fontSize = 20.sp,
//                            letterSpacing = 0.5.sp,
//                            color = TextPrimaryColor.copy(alpha = 0.87f),
//                        )
//                        Spacer(Modifier.height(4.dp))
//                        Button(
//                            onClick = { },
//                            modifier = Modifier.height(30.dp),
//                            colors = ButtonDefaults.buttonColors(containerColor = SecondaryColor),
//                            contentPadding = PaddingValues(vertical = 7.dp, horizontal = 10.dp),
//                            shape = RoundedCornerShape(8.dp),
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.money_bag),
//                                contentDescription = "Add to cart",
//                                colorFilter = ColorFilter.tint(color = PrimaryColor),
//                                modifier = Modifier.height(16.dp)
//                            )
//                            Spacer(Modifier.width(4.dp))
//                            Text(
//                                text = "5 cheeses",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                lineHeight = 16.sp,
//                                color = TextAccentColor,
//                            )
//                        }
//                    }
//                    Button(
//                        modifier = Modifier.size(24.dp),
//                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
//                        contentPadding = PaddingValues(0.dp),
//                        onClick = { },
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.favourite_filled),
//                            contentDescription = "Favourite",
//                            modifier = Modifier.size(24.dp),
//                            colorFilter = ColorFilter.tint(color = PrimaryColor.copy(alpha = 0.87f))
//                        )
//                    }
//                }
//                Spacer(Modifier.height(16.dp))
//                Text(
//                    text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
//                    fontFamily = IBMPlexSansArabic,
//                    fontWeight = FontWeight.Medium,
//                    fontSize = 14.sp,
//                    lineHeight = 20.sp,
//                    letterSpacing = 0.5.sp,
//                    color = TextDarkGreyColor.copy(alpha = 0.6f),
//                )
//                Spacer(Modifier.height(18.dp))
//                Text(
//                    text = "Details",
//                    fontFamily = IBMPlexSansArabic,
//                    fontWeight = FontWeight.Medium,
//                    fontSize = 18.sp,
//                    letterSpacing = 0.5.sp,
//                    color = TextPrimaryColor.copy(alpha = 0.87f),
//                )
//                Spacer(Modifier.height(2.dp))
//                Row(
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    Box(
//                        modifier = Modifier
//                            .weight(1f)
//                            .aspectRatio(1f)
//                            .clip(RoundedCornerShape(12.dp))
//                            .background(SecondaryColor)
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(12.dp),
//                            verticalArrangement = Arrangement.SpaceBetween,
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.temperature),
//                                contentDescription = "Temperature",
//                                modifier = Modifier.size(32.dp),
//                                colorFilter = ColorFilter.tint(color = DefaultButtonColor)
//                            )
//                            Column(
//                                modifier = Modifier.aspectRatio(2f),
//                                verticalArrangement = Arrangement.SpaceBetween,
//                                horizontalAlignment = Alignment.CenterHorizontally,
//                            ) {
//                                Text(
//                                    text = "1000 V",
//                                    fontFamily = IBMPlexSansArabic,
//                                    fontWeight = FontWeight.Medium,
//                                    fontSize = 14.sp,
//                                    letterSpacing = 0.5.sp,
//                                    color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                )
//                                Text(
//                                    text = "Temperature",
//                                    fontFamily = IBMPlexSansArabic,
//                                    fontWeight = FontWeight.Medium,
//                                    fontSize = 12.sp,
//                                    letterSpacing = 0.5.sp,
//                                    color = TextDarkGreyColor.copy(alpha = 0.37f),
//                                )
//                            }
//                        }
//                    }
//                    Spacer(Modifier.width(8.dp))
//                    Box(
//                        modifier = Modifier
//                            .weight(1f)
//                            .aspectRatio(1f)
//                            .clip(RoundedCornerShape(12.dp))
//                            .background(SecondaryColor)
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(12.dp),
//                            verticalArrangement = Arrangement.SpaceBetween,
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.speed),
//                                contentDescription = "Speed",
//                                modifier = Modifier.size(32.dp),
//                                colorFilter = ColorFilter.tint(color = DefaultButtonColor)
//                            )
//                            Column(
//                                modifier = Modifier.aspectRatio(2f),
//                                verticalArrangement = Arrangement.SpaceBetween,
//                                horizontalAlignment = Alignment.CenterHorizontally,
//                            ) {
//                                Text(
//                                    text = "3 sparks",
//                                    fontFamily = IBMPlexSansArabic,
//                                    fontWeight = FontWeight.Medium,
//                                    fontSize = 14.sp,
//                                    letterSpacing = 0.5.sp,
//                                    color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                )
//                                Text(
//                                    text = "Time",
//                                    fontFamily = IBMPlexSansArabic,
//                                    fontWeight = FontWeight.Medium,
//                                    fontSize = 12.sp,
//                                    letterSpacing = 0.5.sp,
//                                    color = TextDarkGreyColor.copy(alpha = 0.37f),
//                                )
//                            }
//                        }
//                    }
//                    Spacer(Modifier.width(8.dp))
//                    Box(
//                        modifier = Modifier
//                            .weight(1f)
//                            .aspectRatio(1f)
//                            .clip(RoundedCornerShape(12.dp))
//                            .background(SecondaryColor)
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(12.dp),
//                            verticalArrangement = Arrangement.SpaceBetween,
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.devil),
//                                contentDescription = "Devil",
//                                modifier = Modifier.size(32.dp),
//                                colorFilter = ColorFilter.tint(color = DefaultButtonColor)
//                            )
//                            Column(
//                                modifier = Modifier.aspectRatio(2f),
//                                verticalArrangement = Arrangement.SpaceBetween,
//                                horizontalAlignment = Alignment.CenterHorizontally,
//                            ) {
//                                Text(
//                                    text = "1M 12K",
//                                    fontFamily = IBMPlexSansArabic,
//                                    fontWeight = FontWeight.Medium,
//                                    fontSize = 14.sp,
//                                    letterSpacing = 0.5.sp,
//                                    color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                )
//                                Text(
//                                    text = "No. of deaths",
//                                    fontFamily = IBMPlexSansArabic,
//                                    fontWeight = FontWeight.Medium,
//                                    fontSize = 12.sp,
//                                    letterSpacing = 0.5.sp,
//                                    color = TextDarkGreyColor.copy(alpha = 0.37f),
//                                )
//                            }
//                        }
//                    }
//                }
//                Spacer(Modifier.height(19.dp))
//                Text(
//                    text = "Preparation method",
//                    fontFamily = IBMPlexSansArabic,
//                    fontWeight = FontWeight.Medium,
//                    fontSize = 18.sp,
//                    letterSpacing = 0.5.sp,
//                    color = TextPrimaryColor.copy(alpha = 0.87f),
//                )
//                Spacer(Modifier.height(2.dp))
//                Column{
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ) {
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(vertical = 2.dp)
//                                .padding(start = 18.dp)
//                                .defaultMinSize(1.dp, 32.dp)
//                                .align(Alignment.Center)
//                                .clip(RoundedCornerShape(12.dp))
//                                .clipToBounds()
//                                .background(color = White),
//                        ) {
//                            Text(
//                                text = "Put the pasta in a toaster.",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Normal,
//                                fontSize = 14.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                modifier = Modifier
//                                    .padding(start = 26.dp)
//                                    .align(Alignment.CenterVertically)
//                                    .weight(1f)
//                            )
//                        }
//                        Box(
//                            modifier = Modifier
//                                .size(36.dp)
//                                .border(width = 1.dp, color = SecondaryColor, shape = CircleShape)
//                                .clip(CircleShape)
//                                .clipToBounds()
//                                .background(color = White)
//                        ) {
//                            Text(
//                                text = "1",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                color = Color(0xFF035587),
//                                modifier = Modifier.align(Alignment.Center)
//                            )
//                        }
//                    }
//                    Spacer(Modifier.height(8.dp))
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ) {
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(vertical = 2.dp)
//                                .padding(start = 18.dp)
//                                .defaultMinSize(1.dp, 32.dp)
//                                .align(Alignment.Center)
//                                .clip(RoundedCornerShape(12.dp))
//                                .clipToBounds()
//                                .background(color = White),
//                        ) {
//                            Text(
//                                text = "Pour battery juice over it.",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Normal,
//                                fontSize = 14.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                modifier = Modifier
//                                    .padding(start = 26.dp)
//                                    .align(Alignment.CenterVertically)
//                                    .weight(1f)
//                            )
//                        }
//                        Box(
//                            modifier = Modifier
//                                .size(36.dp)
//                                .border(width = 1.dp, color = SecondaryColor, shape = CircleShape)
//                                .clip(CircleShape)
//                                .clipToBounds()
//                                .background(color = White)
//                        ) {
//                            Text(
//                                text = "2",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                color = Color(0xFF035587),
//                                modifier = Modifier.align(Alignment.Center)
//                            )
//                        }
//                    }
//                    Spacer(Modifier.height(8.dp))
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ) {
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(vertical = 2.dp)
//                                .padding(start = 18.dp)
//                                .defaultMinSize(1.dp, 32.dp)
//                                .align(Alignment.Center)
//                                .clip(RoundedCornerShape(12.dp))
//                                .clipToBounds()
//                                .background(color = White),
//                        ) {
//                            Text(
//                                text = "Wait for the spark to ignite.",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Normal,
//                                fontSize = 14.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                modifier = Modifier
//                                    .padding(start = 26.dp)
//                                    .align(Alignment.CenterVertically)
//                                    .weight(1f)
//                            )
//                        }
//                        Box(
//                            modifier = Modifier
//                                .size(36.dp)
//                                .border(width = 1.dp, color = SecondaryColor, shape = CircleShape)
//                                .clip(CircleShape)
//                                .clipToBounds()
//                                .background(color = White)
//                        ) {
//                            Text(
//                                text = "3",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                color = Color(0xFF035587),
//                                modifier = Modifier.align(Alignment.Center)
//                            )
//                        }
//                    }
//                    Spacer(Modifier.height(8.dp))
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ) {
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(vertical = 2.dp)
//                                .padding(start = 18.dp)
//                                .defaultMinSize(1.dp, 32.dp)
//                                .align(Alignment.Center)
//                                .clip(RoundedCornerShape(12.dp))
//                                .clipToBounds()
//                                .background(color = White),
//                        ) {
//                            Text(
//                                text = "Serve with an insulating glove.",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Normal,
//                                fontSize = 14.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                modifier = Modifier
//                                    .padding(start = 26.dp)
//                                    .align(Alignment.CenterVertically)
//                                    .weight(1f)
//                            )
//                        }
//                        Box(
//                            modifier = Modifier
//                                .size(36.dp)
//                                .border(width = 1.dp, color = SecondaryColor, shape = CircleShape)
//                                .clip(CircleShape)
//                                .clipToBounds()
//                                .background(color = White)
//                        ) {
//                            Text(
//                                text = "4",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                color = Color(0xFF035587),
//                                modifier = Modifier.align(Alignment.Center)
//                            )
//                        }
//                    }
//                    Spacer(Modifier.height(8.dp))
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ) {
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(vertical = 2.dp)
//                                .padding(start = 18.dp)
//                                .defaultMinSize(1.dp, 32.dp)
//                                .align(Alignment.Center)
//                                .clip(RoundedCornerShape(12.dp))
//                                .clipToBounds()
//                                .background(color = White),
//                        ) {
//                            Text(
//                                text = "Do Some Extra Action.",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Normal,
//                                fontSize = 14.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                modifier = Modifier
//                                    .padding(start = 26.dp)
//                                    .align(Alignment.CenterVertically)
//                                    .weight(1f)
//                            )
//                        }
//                        Box(
//                            modifier = Modifier
//                                .size(36.dp)
//                                .border(width = 1.dp, color = SecondaryColor, shape = CircleShape)
//                                .clip(CircleShape)
//                                .clipToBounds()
//                                .background(color = White)
//                        ) {
//                            Text(
//                                text = "5",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                color = Color(0xFF035587),
//                                modifier = Modifier.align(Alignment.Center)
//                            )
//                        }
//                    }
//                    Spacer(Modifier.height(8.dp))
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ) {
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(vertical = 2.dp)
//                                .padding(start = 18.dp)
//                                .defaultMinSize(1.dp, 32.dp)
//                                .align(Alignment.Center)
//                                .clip(RoundedCornerShape(12.dp))
//                                .clipToBounds()
//                                .background(color = White),
//                        ) {
//                            Text(
//                                text = "Do Some Extra Action.",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Normal,
//                                fontSize = 14.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                modifier = Modifier
//                                    .padding(start = 26.dp)
//                                    .align(Alignment.CenterVertically)
//                                    .weight(1f)
//                            )
//                        }
//                        Box(
//                            modifier = Modifier
//                                .size(36.dp)
//                                .border(width = 1.dp, color = SecondaryColor, shape = CircleShape)
//                                .clip(CircleShape)
//                                .clipToBounds()
//                                .background(color = White)
//                        ) {
//                            Text(
//                                text = "6",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                color = Color(0xFF035587),
//                                modifier = Modifier.align(Alignment.Center)
//                            )
//                        }
//                    }
//                    Spacer(Modifier.height(8.dp))
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ) {
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(vertical = 2.dp)
//                                .padding(start = 18.dp)
//                                .defaultMinSize(1.dp, 32.dp)
//                                .align(Alignment.Center)
//                                .clip(RoundedCornerShape(12.dp))
//                                .clipToBounds()
//                                .background(color = White),
//                        ) {
//                            Text(
//                                text = "Do Some Extra Action.",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Normal,
//                                fontSize = 14.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                                modifier = Modifier
//                                    .padding(start = 26.dp)
//                                    .align(Alignment.CenterVertically)
//                                    .weight(1f)
//                            )
//                        }
//                        Box(
//                            modifier = Modifier
//                                .size(36.dp)
//                                .border(width = 1.dp, color = SecondaryColor, shape = CircleShape)
//                                .clip(CircleShape)
//                                .clipToBounds()
//                                .background(color = White)
//                        ) {
//                            Text(
//                                text = "7",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                color = Color(0xFF035587),
//                                modifier = Modifier.align(Alignment.Center)
//                            )
//                        }
//                    }
//                    Spacer(Modifier.height(8.dp))
//                }
//            }
//            Box(
//                modifier = Modifier.fillMaxWidth().background(color = White),
//            ) {
//                HorizontalDivider(color = BorderGrey.copy(alpha = 0.12f))
//                Box(
//                    modifier = Modifier.padding(vertical = 13.dp, horizontal = 16.dp),
//                ) {
//                    Button(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(56.dp),
//                        colors = ButtonDefaults.buttonColors(containerColor = DefaultButtonColor),
//                        onClick = { },
//                        shape = RoundedCornerShape(16.dp),
//                    ) {
//                        Text(
//                            text = "Add to cart",
//                            fontFamily = IBMPlexSansArabic,
//                            fontWeight = FontWeight.Medium,
//                            fontSize = 16.sp,
//                            letterSpacing = 0.5.sp,
//                            color = TextWhiteColor.copy(alpha = 0.87f),
//                        )
//                        Box(
//                            modifier = Modifier
//                                .padding(horizontal = 8.dp)
//                                .size(5.dp)
//                                .clip(CircleShape)
//                                .background(color = White.copy(alpha = 0.38f))
//                        )
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally
//                        ) {
//                            Text(
//                                text = "3 cheeses",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 14.sp,
//                                letterSpacing = 0.5.sp,
//                                color = TextWhiteColor,
//                            )
//                            Text(
//                                text = "5 cheeses",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                letterSpacing = 0.5.sp,
//                                textDecoration = TextDecoration.LineThrough,
//                                color = TextWhiteColor.copy(alpha = 0.8f),
//                            )
//                        }
//                    }
//                }
//            }
//        }
//        Image(
//            painter = painterResource(id = R.drawable.pasta),
//            contentDescription = "Pasta",
//            modifier = Modifier
//                .padding(top = 18.dp, end = 24.dp)
//                .align(Alignment.TopEnd)
//                .size(188.dp, 168.dp)
//        )
//        Column(
//            modifier = Modifier.padding(horizontal = 16.dp, vertical = 40.dp)
//        ) {
//            Row {
//                Row(
//                    modifier = Modifier.weight(1f)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.measure),
//                        contentDescription = "Measure",
//                        modifier = Modifier
//                            .size(24.dp)
//                            .clip(CircleShape),
//                        colorFilter = ColorFilter.tint(color = White)
//                    )
//                    Spacer(Modifier.width(8.dp))
//                    Text(
//                        text = "High tension",
//                        fontFamily = IBMPlexSansArabic,
//                        fontWeight = FontWeight.Medium,
//                        fontSize = 16.sp,
//                        maxLines = 2,
//                        color = TextWhiteColor.copy(alpha = 0.87f),
//                    )
//                }
//                Box(modifier = Modifier.weight(1f))
//            }
//            Spacer(Modifier.height(16.dp))
//            Row {
//                Row(
//                    modifier = Modifier.weight(1f)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.food),
//                        contentDescription = "Measure",
//                        modifier = Modifier
//                            .size(24.dp)
//                            .clip(CircleShape),
//                        colorFilter = ColorFilter.tint(color = White)
//                    )
//                    Spacer(Modifier.width(8.dp))
//                    Text(
//                        text = "Shocking foods",
//                        fontFamily = IBMPlexSansArabic,
//                        fontWeight = FontWeight.Medium,
//                        fontSize = 16.sp,
//                        maxLines = 2,
//                        color = TextWhiteColor.copy(alpha = 0.87f),
//                    )
//                }
//                Box(modifier = Modifier.weight(1f))
//            }
//        }
//    }
//}
//
//@Preview(widthDp = 360, heightDp = 772)
//@Composable
//fun Screen2Preview() {
//    Screen2()
//}