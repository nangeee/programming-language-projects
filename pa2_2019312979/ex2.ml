(* prime: int -> bool *)

let _ =
        let prime n = 
                let cnt = ref 0 in
                for i = 1 to n do
                        if n mod i = 0 then cnt := !cnt + 1
                done;
                if !cnt = 2 then true
                else false
        in
        let _ = Format.printf "%b\n" (prime 2) in
        let _ = Format.printf "%b\n" (prime 3) in
        let _ = Format.printf "%b\n" (prime 4) in
        Format.printf "%b\n" (prime 17)
