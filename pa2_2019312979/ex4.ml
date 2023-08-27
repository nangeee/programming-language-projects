(* merge: int list -> int list -> int list *)

let _ =
        let merge: int list -> int list -> int list = 
                fun lst1 lst2 ->
                        let concat = lst1 @ lst2 in
                        List.sort (fun x y -> compare y x) concat
        in
        let print_list lst =
                print_string "[";
                if (List.length lst) = 0 then print_string "]\n"
                else
                        for i = 0 to ((List.length lst) - 1) do
                                print_int (List.nth lst i);
                                if i <> ((List.length lst) - 1) then print_string ";"
                                else print_string "]\n"
                        done;
        in
        let _ = print_list (merge [3;2;1] [5;4]) in
        let _ = print_list (merge [5;3] [5;2]) in
        let _ = print_list (merge [4;2] []) in
        let _ = print_list (merge [] [2;1]) in
        let _ = print_list (merge [] [])in
        let _ = print_list (merge [0;0;0;0] [0;0;0;0]) in
        let _ = print_list (merge [4;3;-2] [9;7;7]) in
        print_list (merge [-2;-999] [])
